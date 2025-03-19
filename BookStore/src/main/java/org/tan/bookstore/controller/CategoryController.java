package org.tan.bookstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.bookstore.entity.Category;
import org.tan.bookstore.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @PostMapping("/create")
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @PostMapping("/update")
    public Category update(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        categoryService.delete(id);
    }

    @GetMapping("/find")
    public Category findById(@RequestParam int id) {
        return categoryService.findById(id);
    }
}
