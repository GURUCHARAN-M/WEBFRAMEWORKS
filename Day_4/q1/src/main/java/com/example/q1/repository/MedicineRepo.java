package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q1.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine,Integer> {

    
} 
