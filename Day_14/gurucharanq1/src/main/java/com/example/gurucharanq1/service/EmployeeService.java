package com.example.gurucharanq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Employee;
import com.example.gurucharanq1.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepo employeeRepo;

    public List<Employee> getData(){
        return employeeRepo.findAll();
    }

    public Employee postData(Employee e){
        return employeeRepo.save(e);
    }

    public Employee getOneData(int id){
        return employeeRepo.findById(id).orElseThrow(()->new Error("Not found"));
    }

}
