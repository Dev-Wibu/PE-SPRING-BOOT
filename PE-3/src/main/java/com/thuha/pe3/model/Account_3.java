package com.thuha.pe3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Account-3")
public class Account_3 {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Pass")
    private String pass;

    @Column(name = "Role")
    private int role;

    public Account_3() {
    }

    public Account_3(String name, String email, String pass, int role) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.role = role;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
