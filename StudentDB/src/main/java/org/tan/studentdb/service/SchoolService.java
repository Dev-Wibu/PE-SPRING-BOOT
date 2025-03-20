package org.tan.studentdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.studentdb.entity.School;
import org.tan.studentdb.entity.Student;
import org.tan.studentdb.repository.SchoolRepo;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo schoolRepo;

    public List<School> getAll() {
        return schoolRepo.findAll();
    }

    public School save(School school) {
        return schoolRepo.save(school);
    }

    public School find(int id) {
        return schoolRepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        schoolRepo.deleteById(id);
    }

    public List<School> findByFeeGreaterThan(double fee) {
        return schoolRepo.findByFeeGreaterThan(fee);
    }

    public List<School> findByName(String name) {
        return schoolRepo.findByName(name);
    }

    public List<Student> findStudentsByName(String name) {
        return schoolRepo.findStudentsByName(name);
    }

}
