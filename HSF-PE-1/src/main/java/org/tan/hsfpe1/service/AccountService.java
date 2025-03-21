package org.tan.hsfpe1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.hsfpe1.entity.Account;
import org.tan.hsfpe1.repo.AccountRepo;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepo accountRepo;

    public Account getAccountById(int id) {
        return accountRepo.findById(id).get();
    }

    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    public Account save(Account account) {
        return accountRepo.save(account);
    }

    public void delete(Account account) {
        accountRepo.delete(account);
    }

    public Account getAccountByUsername(String username) {
        return accountRepo.findByUsername(username);
    }

}
