package org.tan.cardb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.cardb.entity.Car;
import org.tan.cardb.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/find")
    public Car find(@RequestParam Long id) {
        return carService.find(id);
    }

    @PostMapping("/create")
    public Car create(@RequestBody Car car) {
        return carService.save(car);
    }

    @PostMapping("/update")
    public Car update(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam long id) {
        carService.delete(id);
    }

}
