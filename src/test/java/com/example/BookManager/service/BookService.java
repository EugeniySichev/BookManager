package com.example.BookManager.service;

import com.example.BookManager.exception.BookNotFoundException;
import com.example.BookManager.model.Book;
import com.example.BookManager.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
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

    public List<Book> findAllBooks(){
        return bookRepo.findAll();
    }

    public Book updateBook(Book book){
        return bookRepo.save(book);
    }

    public Book findBookById(Long id){
        return bookRepo.findBookById(id)
                .orElseThrow(() -> new BookNotFoundException("User by id" + id + "was not found"));
    }

    public void deleteBook(Long id){
        bookRepo.deleteBookById(id);
    }
}
