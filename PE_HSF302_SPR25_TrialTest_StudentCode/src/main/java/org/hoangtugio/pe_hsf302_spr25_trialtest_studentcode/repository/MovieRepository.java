package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.repository;


import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    @Query("SELECT m FROM Movie m WHERE m.movieName LIKE %?1% OR m.actor LIKE %?1%")
    List<Movie> searchByKeyword(String keyword);
}
