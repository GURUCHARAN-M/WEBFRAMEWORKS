package com.example.gurucharanq1.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Author {
    @Id
    public int id;

    public String name;
    public String email;
    public String phoneNumber;
    public String address;

    @OneToMany(mappedBy = "author")
    @JsonManagedReference
    public List<Book> books;

}
