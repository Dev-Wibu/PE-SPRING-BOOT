package org.tan.cardb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.cardb.entity.Brand;
import org.tan.cardb.repository.BrandRepo;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepo brandRepo;

    public List<Brand> findAll() {
        return brandRepo.findAll();
    }

    public Brand save(Brand brand) {
        return brandRepo.save(brand);
    }

    public Brand find(long id) {
        return brandRepo.findById(id).orElse(null);
    }

    public void delete(long id) {
        brandRepo.deleteById(id);
    }

}
