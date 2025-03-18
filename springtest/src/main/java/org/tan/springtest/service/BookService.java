package org.tan.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.tan.springtest.entity.Book;
import org.tan.springtest.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
