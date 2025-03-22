package com.thuha.pe3.config;

import com.thuha.pe3.model.Account_3;
import com.thuha.pe3.model.School;
import com.thuha.pe3.model.Student;
import com.thuha.pe3.repo.AccountRepo;
import com.thuha.pe3.repo.SchoolRepo;
import com.thuha.pe3.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {
    @Autowired
    AccountRepo accountRepo;

    @Autowired
    SchoolRepo schoolRepo;

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
        accountRepo.save(new Account_3("Thu Ha", "admin@gmail.com", "123", 1));
        accountRepo.save(new Account_3("Thu Ha 1", "staff@gmail.com", "123", 2));
        accountRepo.save(new Account_3("Thu Ha 2", "guest@gmail.com", "123", 3));

        School s1 = new School("FPT", 4);
        School s2 = new School("Hutech", 5);
        School s3 = new School("UEH", 5);
        School s4 = new School("IUH", 3);
        schoolRepo.save(s1);
        schoolRepo.save(s2);
        schoolRepo.save(s3);
        schoolRepo.save(s4);


        studentRepo.save(new Student("Thu Ha 1", 22, "2004", s1));
        studentRepo.save(new Student("Thu Ha 2", 20, "2005", s3));
        studentRepo.save(new Student("Thu Ha 3", 21, "2006", s2));
        studentRepo.save(new Student("Thu Ha 4", 18, "2002", s2));
        studentRepo.save(new Student("Thu Ha 5", 19, "2006", s4));


    }
}
