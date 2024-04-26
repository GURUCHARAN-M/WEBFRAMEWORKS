package com.example.gurucharanq1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Payroll;
import com.example.gurucharanq1.repository.PayrollRepo;

@Service
public class PayrollService {

    @Autowired
    public PayrollRepo payrollRepo;

    public List<Payroll> getData(){
        return payrollRepo.findAll();
    }

    public Payroll postData(Payroll e){
        return payrollRepo.save(e);
    }

}
