package com.thuha.pe3.service;

import com.thuha.pe3.model.School;
import com.thuha.pe3.repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo schoolRepo;

    public List<School> findAll() {
        return schoolRepo.findAll();
    }
}
