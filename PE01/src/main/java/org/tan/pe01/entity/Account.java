package org.tan.pe01.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Username", nullable = false)
    @Nationalized
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Role")
    private String role;



}
