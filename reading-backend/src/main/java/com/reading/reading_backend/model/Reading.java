package com.reading.reading_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Reading {
    /** 読書ID */
    @NotNull
    @Id
    private Long readingId;
    /** 本ID */
    @NotNull
    private Long bookId;
    // test
}
