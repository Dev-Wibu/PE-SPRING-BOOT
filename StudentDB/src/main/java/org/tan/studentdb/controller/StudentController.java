package org.tan.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.studentdb.entity.School;
import org.tan.studentdb.entity.Student;
import org.tan.studentdb.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/find")
    public Student find(@RequestParam int id) {
        return studentService.find(id);
    }

    @PostMapping("/create")
    public Student create(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PostMapping("/update")
    public Student update(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        studentService.delete(id);
    }

    @GetMapping("/findByName")
    public List<Student> findByName(@RequestParam String name) {
        return studentService.findByName(name);
    }

    @GetMapping("/findByGender")
    public List<Student> findByGender(@RequestParam Boolean gender) {
        return studentService.findByGender(gender);
    }

    @GetMapping("/findByGpa")
    public List<Student> findByGpa(@RequestParam double gpa) {
        return studentService.findByGpa(gpa);
    }

    @GetMapping("/findBySchool")
    public List<Student> findBySchool(@RequestParam String name) {
        return studentService.findBySchool(name);
    }



}
