package com.example.gurucharanq2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gurucharanq2.model.Book;
import com.example.gurucharanq2.service.BookService;


@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    public BookService bookService;

    @PostMapping("/book")
    public Book postMethodName(@RequestBody Book entity) {
        return bookService.postBook(entity);
    }
    
    @GetMapping("/book")
    public List<Book> getMethodName() {
        return bookService.getBook();
    }
    
    @GetMapping("/book/{bookId}")
    public Book getOneMethodName(@PathVariable int param) {
        return bookService.getBookById(param);
    }

    @DeleteMapping("/book/{bookId}")
    public String deleteMethodName(@PathVariable int id){
        bookService.deleteBook(id);
        return "Deleted";
    }
    

}
