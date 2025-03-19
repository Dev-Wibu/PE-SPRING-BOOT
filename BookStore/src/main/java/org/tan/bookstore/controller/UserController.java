package org.tan.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.bookstore.entity.Account;
import org.tan.bookstore.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Account> findAll() {
        return userService.findAll();
    }

    @GetMapping("/find")
    public Account findById(@RequestParam Long id) {
        return userService.findById(id);
    }

    @PostMapping("/create")
    public Account create(@RequestBody Account account) {
        return userService.create(account);
    }

    @PostMapping("/update")
    public Account update(@RequestBody Account account) {
        return userService.update(account);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        userService.delete(id);
    }
}
