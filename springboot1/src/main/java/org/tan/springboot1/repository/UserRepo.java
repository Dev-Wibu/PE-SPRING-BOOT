package org.tan.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.springboot1.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User getUserByName(String name);
}
