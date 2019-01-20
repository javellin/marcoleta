package com.example.marcoleta;

import com.example.marcoleta.entities.Book;
import com.example.marcoleta.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.SequenceGenerator;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(path = "/{id}")
    public Book findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping()
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }
}
