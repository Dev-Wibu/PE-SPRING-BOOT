package org.tan.cardb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.cardb.entity.Brand;
import org.tan.cardb.service.BrandService;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @GetMapping("/find")
    public Brand find(@RequestParam long id) {
        return brandService.find(id);
    }

    @PostMapping("/create")
    public Brand create(@RequestBody Brand brand) {
        return brandService.save(brand);
    }

    @PostMapping("/update")
    public Brand update(@RequestBody Brand brand) {
        return brandService.save(brand);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam long id) {
        brandService.delete(id);
    }

}
