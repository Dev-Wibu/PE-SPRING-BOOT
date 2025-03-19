package org.tan.bookstore.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.bookstore.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
