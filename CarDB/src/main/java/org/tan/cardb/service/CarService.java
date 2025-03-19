package org.tan.cardb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.cardb.entity.Brand;
import org.tan.cardb.entity.Car;
import org.tan.cardb.repository.CarRepo;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;

    public List<Car> findAll() {
        return carRepo.findAll();
    }

    public Car save(Car car) {
        return carRepo.save(car);
    }

    public Car find(long id) {
        return carRepo.findById(id).orElse(null);
    }

    public List<Car> findByColor(String color) {
        return carRepo.findByColor(color);
    }

    public void delete(long id) {
        carRepo.deleteById(id);
    }

}
