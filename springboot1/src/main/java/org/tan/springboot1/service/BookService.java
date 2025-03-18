package org.tan.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.springboot1.entity.Book;
import org.tan.springboot1.repository.BookRepo;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBookById(Long id) {
        bookRepo.deleteById(id);
    }

    public Book searchById(Long id) {
        return bookRepo.findById(id).get();
    }
}
