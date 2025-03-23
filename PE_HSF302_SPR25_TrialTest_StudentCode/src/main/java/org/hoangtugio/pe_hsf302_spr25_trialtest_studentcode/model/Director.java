package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "Directors")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;
    @Column(name = "DirectorName")
    @Nationalized
    String directorName;
    @Column(name = "Nationality")
    @Nationalized
    String nationality;

    public Director(String directorName, String nationality) {
        this.directorName = directorName;
        this.nationality = nationality;
    }

    public Director() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
