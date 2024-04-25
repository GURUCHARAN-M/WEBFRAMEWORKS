package com.example.gurucharanq1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq1.model.Employee;
import com.example.gurucharanq1.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {
    
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/employee")
    public List<Employee> postMethodName(@RequestBody String entity) {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee-inner-join")
    public List<Employee> Get1MethodName(@RequestBody String entity) {
        return employeeService.ByInnerJoin();
    }
    @GetMapping("/employee-left-outer-join")
    public List<Employee> Get2MethodName(@RequestBody String entity) {
        return employeeService.ByLeftOuterJoin();
    }
    

}
