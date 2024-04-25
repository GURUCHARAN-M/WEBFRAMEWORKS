package com.example.gurucharanq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq2.model.Department;
import com.example.gurucharanq2.repository.DepartmentRepo;

@Service
public class DepartmentService {
    @Autowired
    public DepartmentRepo departmentRepo;

    public List<Department> getData(){
        return departmentRepo.findAll();
    }
    
    public Department getOneData(int id){
        return departmentRepo.findById(id).orElseThrow(()->new Error("Not found"));
    }

    public Department postData(Department dep){
        return departmentRepo.save(dep);
    }
}
