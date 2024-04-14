package com.example.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q2.model.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee,Integer>{

    
} 
