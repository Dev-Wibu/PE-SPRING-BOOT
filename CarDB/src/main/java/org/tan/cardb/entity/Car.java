package org.tan.cardb.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.NaturalId;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private long id;

    @Column(name = "Name", nullable = false)
    @Nationalized
    private String name;

    @Column(name = "Color")
    private String color;


    @ManyToOne
    @JoinColumn(name = "Brand")
    private Brand brand;

    @Column(name = "Price")
    private double price;

    public Car() {
    }


    public Car(String name, String color, Brand brand, double price) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand=" + brand +
                ", price=" + price +
                '}';
    }
}
