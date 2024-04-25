package com.example.gurucharanq1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Author;
import com.example.gurucharanq1.repository.AuthorRepo;

@Service
public class AuthorService {
    @Autowired
    public AuthorRepo authorRepo;

    public Author postData(Author author){
        return authorRepo.save(author);
    }

    public List<Author> getData(){
        return authorRepo.findAll();
    }
    public Author getOneData(int id){
        return authorRepo.findById(id).orElseThrow(()->new Error("Not FOund"));
    }

    public Author putData(int id,Author author){
        return authorRepo.save(author);
    }
}
