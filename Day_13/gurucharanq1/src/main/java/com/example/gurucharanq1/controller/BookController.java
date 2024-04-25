package com.example.gurucharanq1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.gurucharanq1.model.Book;
import com.example.gurucharanq1.service.BookService;




@RestController
public class BookController {
     @Autowired
    public BookService bookService;

    @PostMapping("/book/author/{authorId}")
    public Book postData(@PathVariable int entity,@RequestBody Book book) {
        return bookService.postData(book);
    }
   
    @DeleteMapping("/book/{bookd}")
    public String deleteDatta(@PathVariable int bookId){
        bookService.deleteData(bookId);
        return "Deleted";
    }
    
}
