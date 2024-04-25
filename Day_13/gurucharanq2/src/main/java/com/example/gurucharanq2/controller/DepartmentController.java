package com.example.gurucharanq2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gurucharanq2.model.Department;
import com.example.gurucharanq2.service.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DepartmentController {

    @Autowired
    public DepartmentService departmentService;

    @PostMapping("/department")
    public Department postMethodName(@RequestBody Department entity) {
       return departmentService.postData(entity);
    }
    @GetMapping("/department")
    public List<Department> getMethodName(@RequestParam String param) {
        return departmentService.getData();
    }
    @GetMapping("/department/{departmentId}/student")
    public Department getOneName(@PathVariable int param) {
        return departmentService.getOneData(param);
    }
    
    
}
