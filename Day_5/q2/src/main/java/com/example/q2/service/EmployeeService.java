package com.example.q2.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.q2.model.Employee;
import com.example.q2.repository.EmployeeRepo;
public class EmployeeService {
    @Autowired
    public EmployeeRepo employeeRepo;

    public Employee postEmployeeData(Employee data){
        return employeeRepo.save(data);
    }
    public void deleteEmployeeData(int id){
        employeeRepo.deleteById(id);
    }
    public Employee putEmployeeData(int id,Employee data){
        Employee a=employeeRepo.findById(id).orElseThrow(()->new Error("Not Found"));
        a.setEmployeeName(data.getEmployeeName());
        a.setDepartment(data.getDepartment());
        a.setEmployeeEmail(data.getEmployeeEmail());
        a.setSalary(data.getSalary());        
        return employeeRepo.save(a);
    }
}
