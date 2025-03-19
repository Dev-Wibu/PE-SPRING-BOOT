package org.tan.bookstore.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.bookstore.entity.Account;

@Repository
public interface UserRepo extends JpaRepository<Account, Long> {

}
