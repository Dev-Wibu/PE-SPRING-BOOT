package org.tan.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tan.studentdb.entity.School;
import org.tan.studentdb.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAll() {
        return schoolService.getAll();
    }

    @GetMapping("/find")
    public School find(@RequestParam int id) {
        return schoolService.find(id);
    }

    @GetMapping("/findByFeeGreaterThan")
    public List<School> findByFeeGreaterThan(@RequestParam double fee) {
        return schoolService.findByFeeGreaterThan(fee);
    }

    @GetMapping("/findByName")
    public List<School> findByName(@RequestParam String name) {
        return schoolService.findByName(name);
    }

    @PostMapping("/create")
    public School create(@RequestBody School school) {
        return schoolService.save(school);
    }

    @PostMapping("/update")
    public School update(@RequestBody School school) {
        return schoolService.save(school);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        schoolService.delete(id);
    }



}
