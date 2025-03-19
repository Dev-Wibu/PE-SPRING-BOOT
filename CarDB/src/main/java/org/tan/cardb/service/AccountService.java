package org.tan.cardb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.cardb.entity.Account;
import org.tan.cardb.repository.AccountRepo;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepo accountRepo;

    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    public Account save(Account account) {
        return accountRepo.save(account);
    }

    public Account find(long id) {
        return accountRepo.findById(id).orElse(null);
    }

    public void delete(long id) {
        accountRepo.deleteById(id);
    }

}
