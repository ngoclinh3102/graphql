package com.practice.graphql.feature.book;

import an.awesome.pipelinr.Pipeline;
import com.practice.graphql.infrastructure.controller.BaseController;
import com.practice.graphql.infrastructure.entities.records.Author;
import com.practice.graphql.infrastructure.entities.records.Book;
import com.practice.graphql.infrastructure.service.AuthenticationManager;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BookController extends BaseController {

    public BookController(Pipeline pipeline, AuthenticationManager authenticationManager) {
        super(pipeline, authenticationManager);
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
}
