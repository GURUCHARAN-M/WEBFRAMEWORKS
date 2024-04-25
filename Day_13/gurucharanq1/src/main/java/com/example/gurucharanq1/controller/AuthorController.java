package com.example.gurucharanq1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq1.model.Author;
import com.example.gurucharanq1.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class AuthorController {
    @Autowired
    public AuthorService authorService;

    @PostMapping("/author")
    public Author postData(@RequestBody Author entity) {
        return authorService.postData(entity);
    }
    @GetMapping("/author/{authorId}")
    public Author getSingleData(@PathVariable int param) {
        return authorService.getOneData(param);
    }
    @GetMapping("/author")
    public List<Author> getData() {
        return authorService.getData();
    }

    @PutMapping("author/{authorId}")
    public Author putMethodName(@PathVariable int id, @RequestBody Author entity) {
        return authorService.putData(id, entity);
    }
    
}
