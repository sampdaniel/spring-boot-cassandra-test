package com.samdaniel.cassandra_test.book;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import static org.springframework.data.cassandra.core.mapping.CassandraType.*;

@Table(value = "books_by_author")
public class Book {
    @Id
    @PrimaryKeyColumn(name = "author_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String id;
    @CassandraType(type = Name.TEXT)
    private String author_name;
    @CassandraType(type = Name.TEXT)
    private String book_name;
    @CassandraType(type = Name.TEXT)
    private String pages;

    public Book() {
    }

    public Book(String id, String author_name, String book_name, String pages) {
        this.id = id;
        this.author_name = author_name;
        this.book_name = book_name;
        this.pages = pages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", author_name='" + author_name + '\'' +
                ", book_name='" + book_name + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}
