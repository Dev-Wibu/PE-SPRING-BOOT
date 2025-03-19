package org.tan.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.bookstore.Repository.UserRepo;
import org.tan.bookstore.entity.Account;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<Account> findAll() {
        return userRepo.findAll();
    }

    public Account findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public Account create(Account account) {
        return userRepo.save(account);
    }

    public Account update(Account account) {
        return userRepo.save(account);
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
    }


}
