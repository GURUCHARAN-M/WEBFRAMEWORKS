package com.example.gurucharanq2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gurucharanq2.model.Student;
import com.example.gurucharanq2.service.StudentService;



@RestController
public class StudentController {

     @Autowired
    public StudentService studentService;

    @PostMapping("/department/{departmentId}/student")
    public Student postMethodName(@RequestBody Student entity) {
       return studentService.postData(entity);
    }
    @GetMapping("/department/student")
    public List<Student> getMethodName(@RequestParam String param) {
        return studentService.getData();
    }
    @GetMapping("/department/student/{studentId}")
    public Student getOneName(@PathVariable int param) {
        return studentService.getOneData(param);
    }
    
}
