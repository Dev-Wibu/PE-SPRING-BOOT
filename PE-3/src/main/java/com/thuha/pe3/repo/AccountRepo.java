package com.thuha.pe3.repo;

import com.thuha.pe3.model.Account_3;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account_3,Long> {
    Account_3 findByName(String name);

    Account_3 findByEmail(String email);
}
