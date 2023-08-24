package com.practice.graphql.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 16)
    private String ISBN;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer category1Id;

    private Integer category2Id;

    private Integer category3Id;

    private String publisher;

    private Integer publishingYear;

    private String authorName;

    @Column(nullable = false)
    private Integer copiesQuantity = 0;

    @Column(nullable = false)
    private Integer borrowed = 0;
}
