package com.example.q2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q2controller {
    @GetMapping("/studentName")
    public String welcomeStudent(@RequestParam("studentName") String studentName) {
        return "Welcome " + studentName + "!";
    }
}


