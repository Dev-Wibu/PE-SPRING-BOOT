package com.thuha.pe3.service;

import com.thuha.pe3.model.Account_3;
import com.thuha.pe3.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepo accountRepo;

     public Account_3 findByEmail(String email) {
         return accountRepo.findByEmail(email);
     }
}
