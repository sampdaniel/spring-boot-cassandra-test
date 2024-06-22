package com.samdaniel.cassandra_test.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/authors")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAllAuthors();
    }

    @GetMapping("/{authorId}")
    public String getBooks(@PathVariable String authorId) {
        return authorId;
    }

    @PostMapping("/")
    public String setBook(@RequestBody Book book) {
        return "Inserted";
    }
}
