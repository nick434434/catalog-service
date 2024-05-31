package com.polarbookshop.catalogservice.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public record Book (
    @NotBlank(message = "The book ISBN cannot be blank")
    @Pattern(
        regexp = "^(\\d{10}|\\d{13})$",
        message = "The ISBN must be correctly formatted"
    )
    String isbn,

    @NotBlank(message = "The book title cannot be blank")
    String title,

    @NotBlank(message = "The book author cannot be blank")
    String author,

    @NotNull(message = "The book price must be defined")
    @Positive(message = "The book price must be a positive rational number")
    Double price
){}
