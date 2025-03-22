package com.thuha.pe3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Age")
    private int age;

    @Column(name = "Yob")
    private String yob;

    @ManyToOne
    @JoinColumn(name = "SchoolId")
    private School school;

    public Student() {
    }

    public Student(String name, int age, String yob, School school) {
        this.name = name;
        this.age = age;
        this.yob = yob;
        this.school = school;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
