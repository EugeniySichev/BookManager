package com.example.BookManager.service;

import com.example.BookManager.model.Book;
import com.example.BookManager.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService {
    private final  BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public Book addBook(Book book){
        book.setBookText(UUID.randomUUID().toString());
        return bookRepo.save(book);
    }
}
