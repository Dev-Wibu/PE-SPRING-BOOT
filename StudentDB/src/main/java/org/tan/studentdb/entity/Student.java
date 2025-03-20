package org.tan.studentdb.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = false)
    @Nationalized
    private String name;

    @Column(name = "Gender")
    private Boolean gender;

    @Column(name = "GPA")
    private double gpa;

    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School school;

    public Student() {
    }

    public Student(String name, Boolean gender, double gpa, School school) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", gpa=" + gpa +
                ", school=" + school +
                '}';
    }
}
