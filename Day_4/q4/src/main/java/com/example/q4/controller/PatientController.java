package com.example.q4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.q4.model.Patient;
import com.example.q4.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class PatientController {
    @Autowired
    public PatientService patientService;
    @PostMapping("/patient")
    public Patient postData(@RequestBody Patient param) {
        return patientService.postPatientData(param);
    }
    @GetMapping("/patient")
    public List<Patient> getData() {
        return patientService.getPatientData();
    }
    @GetMapping("/patient/{patientId}")
    public Patient getOneData(@PathVariable int id) {
        return patientService.getOnePatientData(id);
    }
    
}
