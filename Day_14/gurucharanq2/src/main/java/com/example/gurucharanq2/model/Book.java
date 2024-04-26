package com.example.gurucharanq2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    public int bookId;

    public String title;
    public String author;
    public int availableCopies;
    public int totalCopies;

}
