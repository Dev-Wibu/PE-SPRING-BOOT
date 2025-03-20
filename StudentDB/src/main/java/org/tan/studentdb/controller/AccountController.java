package org.tan.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.studentdb.entity.Account;
import org.tan.studentdb.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAll() {
        return accountService.getAll();
    }

    @GetMapping("/find")
    public Account find(@RequestParam int id) {
        return accountService.find(id);
    }

    @PostMapping("/create")
    public Account create(@RequestBody Account account) {
        return accountService.save(account);
    }

    @PostMapping("/update")
    public Account update(@RequestBody Account account) {
        return accountService.save(account);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        accountService.delete(id);
    }
}
