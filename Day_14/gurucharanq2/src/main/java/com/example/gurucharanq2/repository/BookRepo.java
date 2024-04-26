package com.example.gurucharanq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq2.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
