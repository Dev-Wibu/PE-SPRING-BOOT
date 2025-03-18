package org.tan.springboot1.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.NaturalId;


@Entity
public class Book {
    @Id
    @Column(name = "Id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Title", nullable = false)
    @Nationalized
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "NXB")
    private String nxb;

    public Book( String title, String author, String nxb) {
        this.title = title;
        this.author = author;
        this.nxb = nxb;
    }

    public Book() {
    }

    public long getId() {
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

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", nxb='" + nxb + '\'' +
                '}';
    }
}
