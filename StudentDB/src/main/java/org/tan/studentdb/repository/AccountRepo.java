package org.tan.studentdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.studentdb.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
}
