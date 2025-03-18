package org.tan.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.tan.springtest.entity.Book;
import org.tan.springtest.repository.BookRepository;
import org.tan.springtest.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    public BookService bookService;


    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @PostMapping("/create")
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @GetMapping("/find")
    public Book findById(@RequestParam("id") Long id) {
        return bookService.findById(id);
    }
}
