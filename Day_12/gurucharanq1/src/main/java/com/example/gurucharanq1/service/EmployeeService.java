package com.example.gurucharanq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Employee;
import com.example.gurucharanq1.repository.EmployeeRepo;

@Service
public class EmployeeService {


    @Autowired
    public EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public List<Employee> ByInnerJoin() {
        return employeeRepo.getByInnerJoin();
    }
    public List<Employee> ByLeftOuterJoin() {
        return employeeRepo.getByLeftOuterJoin();
    }

}
