package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.Status;

@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @Column(name = "MovieID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int movieId;
    @Column(name = "MovieName")
    @Nationalized
    String movieName;
    @Column(name = "Duration")
    int duration;
    @Nationalized
    @Column(name = "Actor")
    String actor;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    @Nationalized
    Status status;

    @ManyToOne
    @JoinColumn(name = "DirectorID")
    Director director;

    public Movie(String movieName, int duration, String actor, Status status, Director director) {
        this.movieName = movieName;
        this.duration = duration;
        this.actor = actor;
        this.status = status;
        this.director = director;
    }

    public Movie() {
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
