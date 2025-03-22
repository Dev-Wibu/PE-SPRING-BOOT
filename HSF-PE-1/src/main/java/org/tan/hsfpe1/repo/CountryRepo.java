package org.tan.hsfpe1.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.hsfpe1.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Long> {

}
