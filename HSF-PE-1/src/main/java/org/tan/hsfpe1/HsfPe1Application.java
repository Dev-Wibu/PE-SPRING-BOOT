package org.tan.hsfpe1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tan.hsfpe1.entity.Account;
import org.tan.hsfpe1.entity.Country;
import org.tan.hsfpe1.entity.Food;
import org.tan.hsfpe1.repo.AccountRepo;
import org.tan.hsfpe1.service.AccountService;
import org.tan.hsfpe1.service.CountryService;
import org.tan.hsfpe1.service.FoodService;

@SpringBootApplication
public class HsfPe1Application implements CommandLineRunner {

    @Autowired
    AccountService accountService;

    @Autowired
    CountryService countryService;

    @Autowired
    FoodService foodService;
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


        Country country = new Country("USA", "Dan chu");
        Country country1 = new Country("Nga", "gau nau");
        Country country2 = new Country("Uca", "Lesky ngu");
        Country country3 = new Country("VN", "Muon nam");
        countryService.save(new Country("USA", "Dan chu"));
        countryService.save(country1);
        countryService.save(country2);
        countryService.save(country3);
        countryService.getAll().forEach(System.out::println);


        foodService.save(new Food("KFC", "Ngon", country));
        foodService.save(new Food("Pizaa", "Ngon", country));
        foodService.save(new Food("Voska", "Ngon", country1));
        foodService.save(new Food("Keo dong", "Ngon", country2));
        foodService.save(new Food("Pho", "Ngon", country3));
        foodService.getAll().forEach(System.out::println);

    }
}
