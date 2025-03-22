package com.thuha.pe3.controller;

import com.thuha.pe3.model.Account_3;
import com.thuha.pe3.service.AccountService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/login")
    public String login(@RequestParam("name") String name, @RequestParam("pass") String password, HttpSession session, Model model) {
        Account_3 account = accountService.findByEmail(name);
        if (account != null && account.getPass().equals(password)) {
            session.setAttribute("user", account);
            return "redirect:/get";
        } else {
            model.addAttribute("error", "Invalid email or password !!");
            return "login";
        }
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
