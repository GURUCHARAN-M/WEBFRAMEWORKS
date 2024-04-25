package com.example.gurucharanq2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq2.model.Student;
import com.example.gurucharanq2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    public StudentRepo employeeRepo;

    public List<Student> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public List<Student> ByInnerJoin() {
        return employeeRepo.getByInnerJoin();
    }
    public List<Student> ByLeftOuterJoin() {
        return employeeRepo.getByLeftOuterJoin();
    }

}
