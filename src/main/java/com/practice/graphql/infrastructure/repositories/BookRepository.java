package com.practice.graphql.infrastructure.repositories;

import com.practice.graphql.infrastructure.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
