package com.practice.graphql.infrastructure.enums;

public enum BorrowStatus {
    Borrowing("Đang mượn"),
    Returned("Đã trả"),
    Loss("Làm mất");

    public final String DESCRIPTION;

    BorrowStatus(String desc) { this.DESCRIPTION = desc; }
}
