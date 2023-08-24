package com.practice.graphql.infrastructure.entities;

import com.practice.graphql.infrastructure.enums.BorrowStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer bookId;

    @Column(nullable = false)
    private Integer readerId;

    @Column(nullable = false)
    private Date borrowedDate;

    private Date returnDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BorrowStatus status = BorrowStatus.Borrowing;
}
