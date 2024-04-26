package com.example.gurucharanq1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;

import com.example.gurucharanq1.model.Payroll;
import com.example.gurucharanq1.service.PayrollService;
import org.springframework.web.bind.annotation.*;


@RestController
public class PayrollController {

    @Autowired
    public PayrollService payrollService;

    @PostMapping("/employee/{employeeId}/payroll")
    public Payroll postMethodName(@PathVariable int id,@RequestBody Payroll entity) {
        return payrollService.postData(entity);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public List<Payroll> getMethodName() {
        return payrollService.getData();
    }
    
}
