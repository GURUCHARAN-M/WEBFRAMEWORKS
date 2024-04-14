package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class q1controller {
    @GetMapping("/welcome")
    public String getMethodName() {
        return new String("Welcome Spring Boot!");
    }
        
}