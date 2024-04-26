package com.example.gurucharanq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
