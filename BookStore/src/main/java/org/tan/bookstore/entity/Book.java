package org.tan.bookstore.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Title", nullable = false)
    @Nationalized
    private String title;

    @Column(name = "Author")
    @Nationalized
    private String author;

    @Column(name = "Price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "Category")
    private Category category;

    public Book() {
    }

    public Book(String title, String author, double price, Category category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
