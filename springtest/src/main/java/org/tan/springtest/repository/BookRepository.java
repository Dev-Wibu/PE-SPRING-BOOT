package org.tan.springtest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.springtest.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
