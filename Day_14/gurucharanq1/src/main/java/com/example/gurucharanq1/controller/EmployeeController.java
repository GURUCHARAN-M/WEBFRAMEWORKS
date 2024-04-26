package com.example.gurucharanq1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq1.model.Employee;
import com.example.gurucharanq1.service.EmployeeService;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee postMethodName(@RequestBody Employee entity) {
        return employeeService.postData(entity);
    }

    @GetMapping("/employee")
    public List<Employee> getMethodName() {
        return employeeService.getData();
    }
    
    @GetMapping("/employee/{employeeId}")
    public Employee findEmployee(@PathVariable int id){
        return employeeService.getOneData(id);
    }

}
