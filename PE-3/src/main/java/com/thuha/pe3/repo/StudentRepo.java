package com.thuha.pe3.repo;

import com.thuha.pe3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    public List<Student> findAllByNameContainingOrSchool_NameContaining(String name, String school);
}
