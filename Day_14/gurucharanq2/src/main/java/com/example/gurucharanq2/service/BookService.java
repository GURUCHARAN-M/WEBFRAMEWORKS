package com.example.gurucharanq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq2.model.Book;
import com.example.gurucharanq2.repository.BookRepo;

@Service
public class BookService {

    @Autowired
    public BookRepo bookRepo;

    public Book postBook(Book b){
        return bookRepo.save(b);
    }

    public List<Book> getBook(){
        return bookRepo.findAll();
    }

    public Book  getBookById(int id) {
    	return bookRepo.findById(id).orElseThrow();
    }

    public void deleteBook(int id){
        bookRepo.deleteById(id);
    }

}
