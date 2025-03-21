package org.tan.hsfpe1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tan.hsfpe1.entity.Account;
import org.tan.hsfpe1.repo.AccountRepo;
import org.tan.hsfpe1.service.AccountService;

@SpringBootApplication
public class HsfPe1Application implements CommandLineRunner {

    @Autowired
    AccountService accountService;
    public static void main(String[] args) {
        SpringApplication.run(HsfPe1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account account = new Account("Admin", "123", "Admin");
        Account account1 = new Account("staff", "123", "Staff");
        Account account2 = new Account("Guest", "123", "Customer");

        accountService.save(account);
        accountService.save(account1);
        accountService.save(account2);

        accountService.getAllAccounts().forEach(System.out::println);

    }
}
