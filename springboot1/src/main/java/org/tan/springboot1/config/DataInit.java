package org.tan.springboot1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.tan.springboot1.entity.Book;
import org.tan.springboot1.repository.BookRepo;

@Component
public class DataInit implements CommandLineRunner {
    @Autowired
    private BookRepo bookRepository;


    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("Java", "Tan", "NXB1");
        Book book2 = new Book("Java2", "Tan2", "NXB2");
        Book book3 = new Book("Java3layer", "Tan3", "NXB3");
        Book book4 = new Book("C#", "Tan4", "NXB4");

        bookRepository.save(book);
        bookRepository.save(book2);
        bookRepository.save(book3);
        bookRepository.save(book4);

    }
}
