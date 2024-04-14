package com.example.q4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q4.model.Patient;
import com.example.q4.repository.PatientRepo;


@Service
public class PatientService {
    @Autowired
    public PatientRepo patientRepo;

    public Patient postPatientData(Patient data){
        return patientRepo.save(data);
    }
    public List<Patient> getPatientData(){
        return patientRepo.findAll();
    }
    public Patient getOnePatientData(int id){
        return patientRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }
}
