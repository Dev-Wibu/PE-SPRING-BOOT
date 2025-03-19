package org.tan.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.bookstore.Repository.CategoryRepo;
import org.tan.bookstore.entity.Category;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    public Category findById(int id) {
        return categoryRepo.findById(id).orElse(null);
    }

    public Category create(Category category) {
        return categoryRepo.save(category);
    }

    public Category update(Category category) {
        return categoryRepo.save(category);
    }

    public void delete(int id) {
        categoryRepo.deleteById(id);
    }


}
