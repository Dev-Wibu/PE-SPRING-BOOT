package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.service;

import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Director;
import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    public List<Director> getAll ()
    {
        return directorRepository.findAll();
    }

    public Director create (Director director)
    {
        return directorRepository.save(director);
    }

}
