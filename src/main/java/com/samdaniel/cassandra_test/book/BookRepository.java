package com.samdaniel.cassandra_test.book;

import org.springframework.data.cassandra.repository.MapIdCassandraRepository;

public interface BookRepository extends MapIdCassandraRepository<Book> {
}
