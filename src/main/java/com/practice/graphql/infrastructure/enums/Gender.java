package com.practice.graphql.infrastructure.enums;

public enum Gender {
    Male("Nam"),
    Other("Khác"),
    Female("Nữ");

    public final String DESCRIPTION;

    Gender(String desc) { this.DESCRIPTION = desc; }
}
