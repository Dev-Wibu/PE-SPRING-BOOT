package org.tan.studentdb.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = false)
    @Nationalized
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Fee")
    private double fee;

    public School() {
    }
    public School(int id, String name, String address, double fee) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.fee = fee;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fee=" + fee +
                '}';
    }
}
