package org.tan.studentdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.studentdb.entity.Student;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByGender(Boolean gender);

    List<Student> findByName(String name);

    List<Student> findByGpa(double gpa);

    List<Student> findBySchoolName(String name);
}
