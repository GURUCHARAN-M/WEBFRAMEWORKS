package com.example.q4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q4.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer> {

    
}
