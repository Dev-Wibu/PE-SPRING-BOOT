package org.tan.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.tan.bookstore.entity.Book;
import org.tan.bookstore.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getBooks() {
        return bookService.findAll();
    }

    @GetMapping("/find")
    public Book findById(@RequestParam Long id) {
        return bookService.findById(id);
    }

    @PostMapping("/create")
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PostMapping("/update")
    public Book update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        bookService.delete(id);
    }
}
