package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode;

import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Account;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Director;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Movie;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service.AccountService;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service.DirectorService;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeHsf302Spr25TrialTestStudentCodeApplication implements CommandLineRunner {

    @Autowired
    AccountService accountService;

    @Autowired
    DirectorService directorService;

    @Autowired
    MovieService movieService;

    public static void main(String[] args) {
        SpringApplication.run(PeHsf302Spr25TrialTestStudentCodeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello FPT");

        Account account1 = new Account("admin@","@4",1);
        Account account2 = new Account("customer@","@4",4);
        Account account3 = new Account("manager@","@4",3);
        Account account4 = new Account("staff@","@4",2);

        accountService.create(account1);
        accountService.create(account2);
        accountService.create(account3);
        accountService.create(account4);

        accountService.getAll().forEach(account -> System.out.println(account.getEmail()));

        Director director1 = new Director("Phontharis","Thailand");
        Director director2 = new Director("Fujiko Fujio","Japan");
        Director director3 = new Director("James Cameron","USA");

        directorService.create(director1);
        directorService.create(director2);
        directorService.create(director3);

        directorService.getAll().forEach(director -> System.out.println(director.getDirectorName()+"-"+director.getNationality()));

        Movie movie1 = new Movie("PEE NAK 4",125,"Witthawat ",Status.ACTIVE,director1);
        Movie movie2 = new Movie("Doraemon",115,"Nobita ",Status.ACTIVE,director2);
        Movie movie3 = new Movie("Doraemon 2022",120,"Doraemon ",Status.INACTIVE,director2);
        Movie movie4 = new Movie("Avatar",192,"Kate Winslet ",Status.INACTIVE,director3);

        movieService.create(movie1);
        movieService.create(movie2);
        movieService.create(movie3);
        movieService.create(movie4);

        movieService.getAll().forEach(movie -> {
            System.out.println("Movie ID: " + movie.getMovieId());
            System.out.println("Movie Name: " + movie.getMovieName());
            System.out.println("Duration: " + movie.getDuration());
            System.out.println("Actor: " + movie.getActor());
            System.out.println("Status: " + movie.getStatus());
            System.out.println("Director: " + movie.getDirector().getDirectorName());
            System.out.println("-----------------------------");
        });


    }
}
