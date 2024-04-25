package com.example.gurucharanq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq2.model.Student;
import com.example.gurucharanq2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    public StudentRepo studentRepo;

    public List<Student> getData(){
        return studentRepo.findAll();
    }
    
    public Student getOneData(int id){
        return studentRepo.findById(id).orElseThrow(()->new Error("Not found"));
    }

    public Student postData(Student dep){
        return studentRepo.save(dep);
    }
}
