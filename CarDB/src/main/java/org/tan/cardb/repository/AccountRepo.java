package org.tan.cardb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.cardb.entity.Account;

@Repository public interface AccountRepo extends JpaRepository<Account, Long> {

}
