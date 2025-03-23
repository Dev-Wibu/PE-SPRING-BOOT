package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service;


import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Account;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAll()
    {
        return accountRepository.findAll();
    }

    public Account create (Account account)
    {
        return accountRepository.save(account);
    }

    public Account findByEmail(String email)
    {
        return accountRepository.getAccountsByEmail(email);
    }

}
