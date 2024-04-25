package com.example.gurucharanq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq2.model.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {

}
