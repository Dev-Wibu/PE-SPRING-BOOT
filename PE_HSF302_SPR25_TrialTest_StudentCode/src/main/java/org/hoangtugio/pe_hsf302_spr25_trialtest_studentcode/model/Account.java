package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Accounts")
public class Account {

    @Id
            @Column(name = "Email")
    String email;
    @Column ( name = "Password")
    String password;
    @Column ( name = "RoleID")
    int roleId;

    public Account(String email, String password, int roleId) {
        this.email = email;
        this.password = password;
        this.roleId = roleId;
    }

    public Account() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
