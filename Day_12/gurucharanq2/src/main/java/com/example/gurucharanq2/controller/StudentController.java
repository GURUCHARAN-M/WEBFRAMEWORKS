package com.example.gurucharanq2.controller;
import com.example.gurucharanq2.model.Student;
import com.example.gurucharanq2.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    public StudentService employeeService;

    @PostMapping("/student")
    public List<Student> postMethodName(@RequestBody String entity) {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/students-inner-join")
    public List<Student> Get1MethodName(@RequestBody String entity) {
        return employeeService.ByInnerJoin();
    }
    @GetMapping("/students-left-outer-join")
    public List<Student> Get2MethodName(@RequestBody String entity) {
        return employeeService.ByLeftOuterJoin();
    }
}
