package org.tan.springboot1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.springboot1.entity.Book;
import org.tan.springboot1.service.BookService;


import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PostMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @PostMapping("/delete")
    public void deleteBookById(@RequestParam Long id) {
        bookService.deleteBookById(id);
    }

    @GetMapping("/search")
    public Book searchById(@RequestParam Long id) {
        return bookService.searchById(id);
    }
}
