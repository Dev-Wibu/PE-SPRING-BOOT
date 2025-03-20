package org.tan.studentdb.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.studentdb.entity.School;
import org.tan.studentdb.entity.Student;

import java.util.List;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {
    List<School> findByFeeGreaterThan(double fee);

    List<School> findByName(String name);

    List<Student> findStudentsByName(String name);
}
