package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Medicine;
import com.example.q1.service.MedicineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")

public class MedicineController {
    @Autowired
    public MedicineService medicineService;

    @PostMapping("/medicine")
    public Medicine postData(@RequestBody Medicine param) {
        return medicineService.postMediData(param);
    }
    @GetMapping("/medicines")
    public List<Medicine> getData() {
        return medicineService.getMediData();
    }
    @GetMapping("/medicine/{medicineId}")
    public Medicine getOneData(@PathVariable int param) {
        return medicineService.getOneMediData(param);
    }
    
}
