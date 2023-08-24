package com.practice.graphql.infrastructure.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer bookId;

    @Column(nullable = false)
    private Boolean isBorrowed = Boolean.FALSE;
}
