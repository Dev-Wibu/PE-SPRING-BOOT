package org.tan.cardb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;
import org.tan.cardb.entity.Account;
import org.tan.cardb.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/find")
    public Account find(@RequestParam long id) {
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
    public void delete(@RequestParam long id) {
        accountService.delete(id);
    }


}
