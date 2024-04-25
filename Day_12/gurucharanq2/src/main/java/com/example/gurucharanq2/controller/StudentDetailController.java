package com.example.gurucharanq2.controller;

import com.example.gurucharanq2.model.StudentDetail;
import com.example.gurucharanq2.service.StudentDetailService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentDetailController {
    @Autowired
    public StudentDetailService addressService;

    @PostMapping("/studentDetail/student/{id}")
    public List<StudentDetail> postMethodName(@PathVariable String entity) {
        return addressService.getData();
    }
}
