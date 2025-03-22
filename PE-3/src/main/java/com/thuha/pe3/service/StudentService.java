package com.thuha.pe3.service;

import com.thuha.pe3.model.Student;
import com.thuha.pe3.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student getById(long id) {
        return studentRepo.findById(id).orElseThrow();
    }

    public Student save(Student obj) {
        if(obj.getAge()>100 || obj.getAge()<0) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        else if(Integer.parseInt(obj.getYob())<2000 || Integer.parseInt(obj.getYob())>3000) {
            throw new IllegalArgumentException("Yob must be between 2000 and 3000");
        }
        return studentRepo.save(obj);
    }

    public void deleteById(long id) {
        studentRepo.deleteById(id);
    }

    public List<Student> getByNameOrSchool(String key) {
        return studentRepo.findAllByNameContainingOrSchool_NameContaining(key, key);
    }
}
