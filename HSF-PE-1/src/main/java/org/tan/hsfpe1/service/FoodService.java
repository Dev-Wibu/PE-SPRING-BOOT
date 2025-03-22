package org.tan.hsfpe1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.hsfpe1.entity.Food;
import org.tan.hsfpe1.repo.FoodRepo;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodRepo foodRepo;

    public List<Food> getAll() {
        return foodRepo.findAll();
    }

    public Food getById(long id) {
        return foodRepo.findById(id).orElseThrow();
    }

    public Food save(Food obj) {

        return foodRepo.save(obj);
    }

    public void deleteById(long id) {
        foodRepo.deleteById(id);
    }

//    public List<Food> getByNameOrSchool(String key) {
//        return foodRepo.findAllByNameContainingOrSchool_NameContaining(key, key);
//    }

}
