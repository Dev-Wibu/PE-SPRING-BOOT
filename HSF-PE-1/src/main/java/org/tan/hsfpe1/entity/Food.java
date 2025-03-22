package org.tan.hsfpe1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "CountryId")
    private Country country;

    public Food(String name, String desc, Country country) {
        this.name = name;
        this.desc = desc;
        this.country = country;
    }

    public Food() {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
