package org.tan.hsfpe1.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tan.hsfpe1.entity.Account;
import org.tan.hsfpe1.service.AccountService;

@Controller
public class MainController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        String role = (String) session.getAttribute("role");
        if (role == null){
            return "redirect:/login";
        }
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model, HttpSession session) {
        Account account = accountService.getAccountByUsername(username);
        if (account != null && account.getPassword().equals(password)) {
            session.setAttribute("role", account.getRole());
            return "redirect:/";
        }
        model.addAttribute("error", "invalid");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }


}
