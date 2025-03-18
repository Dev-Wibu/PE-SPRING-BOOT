package org.tan.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.springboot1.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {


}
