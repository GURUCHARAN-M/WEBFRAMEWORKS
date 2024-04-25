package com.example.gurucharanq1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Book;
import com.example.gurucharanq1.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    public BookRepo bookRepo;

    public Book postData(Book book){
        return bookRepo.save(book);
    }

    public String deleteData(int id){
        bookRepo.deleteById(id);
        return "Deleted";
    }
}
