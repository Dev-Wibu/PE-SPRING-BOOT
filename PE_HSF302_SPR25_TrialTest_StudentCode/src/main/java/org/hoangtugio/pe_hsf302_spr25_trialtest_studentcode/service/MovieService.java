package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service;


import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Movie;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAll()
    {
        return movieRepository.findAll();
    }

    public Movie create (Movie movie)
    {
        return movieRepository.save(movie);
    }

    public void delete (int id)
    {
        movieRepository.deleteById(id);
    }

    public List<Movie> searchByNameContainingOrActor(String keyword) {

        return movieRepository.searchByKeyword(keyword);
    }
}
