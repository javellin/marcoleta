package com.example.marcoleta.repositories;

import com.example.marcoleta.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
