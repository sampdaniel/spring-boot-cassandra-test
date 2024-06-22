package com.samdaniel.cassandra_test.book;

import org.springframework.data.cassandra.core.mapping.MapId;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String setAuthor() {
        Book b1 = new Book("1", "Sam", "Book 1", "300");
        Book b2 = new Book("2", "Sam", "Book 1", "300");
        bookRepository.saveAll(List.of(b1, b2));

        return "Inserted Successfully!";
    }

    public List<Book> getAllAuthors() {
        return bookRepository.findAll();
    }

}
