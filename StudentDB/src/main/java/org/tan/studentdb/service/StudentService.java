package org.tan.studentdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tan.studentdb.entity.Student;
import org.tan.studentdb.repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public Student find(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    public void delete(int id) {
        studentRepo.deleteById(id);
    }

    public List<Student> findByName(String name) {
        return studentRepo.findByName(name);
    }

    public List<Student> findByGender(Boolean gender) {
        return studentRepo.findByGender(gender);
    }

    public List<Student> findByGpa(double gpa) {
        return studentRepo.findByGpa(gpa);
    }

    public List<Student> findBySchool(String name) {
        return studentRepo.findBySchoolName(name);
    }

}
