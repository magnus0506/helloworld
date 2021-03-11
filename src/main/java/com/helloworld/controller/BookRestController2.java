package com.helloworld.controller;

import com.helloworld.model.Book;
import com.helloworld.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController2 {
    private final BookRepository bookRepository;

    public BookRestController2(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
