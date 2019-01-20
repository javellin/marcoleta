package com.example.marcoleta.entities;

import javax.persistence.*;

@Entity
@Table(name = "books")
@SequenceGenerator(name="books_seq", allocationSize=100)
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_seq")
    private Long id;

    @Column(name = "title")
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
