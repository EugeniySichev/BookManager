package com.example.BookManager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String email;
    private String genre;
    private String pageNumber;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String bookText;

    public Book(Long id, String name, String email, String genre, String pageNumber, String imageUrl, String bookText) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.genre = genre;
        this.pageNumber = pageNumber;
        this.imageUrl = imageUrl;
        this.bookText = bookText;
    }

    public Book() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBookText() {
        return bookText;
    }

    public void setBookText(String bookText) {
        this.bookText = bookText;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", genre='" + genre + '\'' +
                ", pageNumber='" + pageNumber + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", bookText='" + bookText + '\'' +
                '}';
    }
}
