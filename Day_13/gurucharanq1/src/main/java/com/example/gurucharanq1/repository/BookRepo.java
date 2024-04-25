package com.example.gurucharanq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq1.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

}
