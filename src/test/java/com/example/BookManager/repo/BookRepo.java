package com.example.BookManager.repo;

import com.example.BookManager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
