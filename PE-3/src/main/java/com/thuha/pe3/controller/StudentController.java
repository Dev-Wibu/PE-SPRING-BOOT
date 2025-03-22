package com.thuha.pe3.controller;

import com.thuha.pe3.model.Account_3;
import com.thuha.pe3.model.School;
import com.thuha.pe3.model.Student;
import com.thuha.pe3.service.SchoolService;
import com.thuha.pe3.service.StudentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private SchoolService schoolService;

    @GetMapping("/get")
    public String get(Model model, @RequestParam(name = "key", required = false) String keyword, HttpSession session) {
        Account_3 user = (Account_3) session.getAttribute("user");
        if (user == null) {
            model.addAttribute("error", "You are not logged in");
            return "login";
        } else if (user.getRole() == 3) {
            model.addAttribute("error", "You don't have enough permission to do this");
            return "Login";
        }
        List<Student> students;
        if (keyword != null && !keyword.isEmpty()) {
            students = studentService.getByNameOrSchool(keyword);
        } else {
            students = studentService.getAll();
        }
        model.addAttribute("role", user.getRole());

        List<School> schools = schoolService.findAll();
        model.addAttribute("schools", schools);
        model.addAttribute("students", students);
        return "Student";
    }


    @GetMapping("/delete/{id}")//path param
    public String delete(@PathVariable("id") long id, HttpSession session, Model model) {
        Account_3 user = (Account_3) session.getAttribute("user");
        if (user == null) {
            model.addAttribute("error", "You are not logged in");
            return "Login";
        } else if (user.getRole() == 2) {
            return "redirect:/get";
        } else if (user.getRole() == 3) {
            model.addAttribute("error", "You don't have enough permission to do this");
            return "Login";
        }

        studentService.deleteById(id);

        return "redirect:/get";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model, HttpSession session) {
        Account_3 user = (Account_3) session.getAttribute("user");
        if (user == null) {
            model.addAttribute("error", "You are not logged in");
            return "Login";
        } else if (user.getRole() == 2) {
            return "redirect:/get";
        } else if (user.getRole() == 3) {
            model.addAttribute("error", "You don't have enough permission to do this");
            return "Login";
        }

        List<School> cate = schoolService.findAll();
        model.addAttribute("schools", cate);
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("students", studentService.getAll());
        return "Student";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model, HttpSession session) {
        Account_3 user = (Account_3) session.getAttribute("user");
        if (user == null) {
            model.addAttribute("error", "You are not logged in");
            return "Login";
        } else if (user.getRole() == 2) {
            return "redirect:/get";
        } else if (user.getRole() == 3) {
            model.addAttribute("error", "You don't have enough permission to do this");
            return "Login";
        }


        List<School> cate = schoolService.findAll();
        model.addAttribute("schools", cate);
        Student st = studentService.getById(id);
        model.addAttribute("student", st);
        model.addAttribute("students", studentService.getAll());
        return "Student";
    }

    @PostMapping("/save")
    public String save(Student student, Model model) {
        try {
            studentService.save(student);
            return "redirect:/get";
        } catch (IllegalArgumentException e) {
            model.addAttribute("students", studentService.getAll());
            model.addAttribute("schools", schoolService.findAll());
            model.addAttribute("error", e.getMessage());
            return "Student";
        }
    }
}
