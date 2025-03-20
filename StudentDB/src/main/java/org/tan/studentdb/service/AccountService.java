package org.tan.studentdb.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.studentdb.entity.Account;
import org.tan.studentdb.repository.AccountRepo;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepo accountRepo;

    public List<Account> getAll() {
        return accountRepo.findAll();
    }

    public Account save(Account account) {
        return accountRepo.save(account);
    }

    public Account find(int id) {
        return accountRepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        accountRepo.deleteById(id);
    }

}
