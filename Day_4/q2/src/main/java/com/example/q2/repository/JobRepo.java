package com.example.q2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q2.model.Job;


public interface JobRepo extends JpaRepository<Job,Integer> {

    
} 