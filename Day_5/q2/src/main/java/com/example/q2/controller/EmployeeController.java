package com.example.q2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Employee;
import com.example.q2.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee postData(@RequestBody Employee param) {
        return employeeService.postEmployeeData(param);
    }
    @DeleteMapping("/employee/{employeeId}")
    public String deleteData(@PathVariable int id) {
        employeeService.deleteEmployeeData(id);
        return "Employee Deleted";
    }
    @PutMapping("/employee/{employeeId}")
    public Employee putData(@PathVariable int id,@RequestBody Employee param) {
        return employeeService.putEmployeeData(id,param);
    }
}

