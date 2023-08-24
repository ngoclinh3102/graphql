package com.practice.graphql.infrastructure.entities;

import com.practice.graphql.infrastructure.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender = Gender.Other;

    @Column(nullable = false)
    private Date dob;
}
