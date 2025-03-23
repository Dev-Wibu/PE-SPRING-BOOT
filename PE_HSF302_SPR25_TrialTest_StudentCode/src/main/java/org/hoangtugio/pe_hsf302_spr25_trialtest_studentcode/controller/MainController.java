package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.controller;


import jakarta.servlet.http.HttpSession;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Account;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Director;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Movie;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service.AccountService;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service.DirectorService;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    DirectorService directorService;
    @Autowired
    MovieService movieService;
    @Autowired
    AccountService accountService;

    @GetMapping
    public String index (Model model, HttpSession session)
    {
        String role = (String) session.getAttribute("role");
        if (role == null) {
            return "redirect:/login";
        }

        List<Movie> movies = movieService.getAll();
        List<Director> directors = directorService.getAll();
        model.addAttribute("movies",movies);
        model.addAttribute("directors",directors);

        return "index";

    }

    @PostMapping("/delete")
    String delete (int id)
    {
        movieService.delete(id);
        return "redirect:/";
    }

    @PostMapping("/create")

            String create (Movie movie)
    {
        movieService.create(movie);
        return "redirect:/";
    }


    @GetMapping("/search")
    public String search(String keyword, Model model) {
        List<Movie> movies = movieService.searchByNameContainingOrActor(keyword);
        List<Director> directors = directorService.getAll();
        model.addAttribute("movies", movies);
        model.addAttribute("directors", directors);
        model.addAttribute("searchName",keyword);
        return "index";
    }

    @PostMapping("/update")
    public String update (Movie movie)
    {
        movieService.create(movie);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model, HttpSession session) {

        Account account = accountService.findByEmail(username);
        if (account != null && account.getPassword().equals(password)) {
            if (account.getRoleId() ==1) {
                session.setAttribute("role", "admin");
            } else if (account.getRoleId() == 2) {
                session.setAttribute("role", "staff");
            } else {
                session.setAttribute("role", "customer");
            }
            return "redirect:/";
        }
        model.addAttribute("error", true);
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }




}
