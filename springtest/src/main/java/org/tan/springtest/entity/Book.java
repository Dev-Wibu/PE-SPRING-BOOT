package org.tan.springtest.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "NXB")
    private String NXB;

    public Book() {
    }

    public Book(String NXB, String author, String title) {
        this.NXB = NXB;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", NXB='" + NXB + '\'' +
                '}';
    }
}
