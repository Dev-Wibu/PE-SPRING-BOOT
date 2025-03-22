package org.tan.hsfpe1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.hsfpe1.entity.Country;
import org.tan.hsfpe1.repo.CountryRepo;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepo countryRepo;

    public List<Country> getAll(){
        return countryRepo.findAll();
    }

    public Country save(Country obj){
        return countryRepo.save(obj);
    }

}
