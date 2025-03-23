package org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.repository;

import org.hoangtugio.pe_hsf302_spr25_trialtest_studentcode.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
    Account getAccountsByEmail(String email);
}
