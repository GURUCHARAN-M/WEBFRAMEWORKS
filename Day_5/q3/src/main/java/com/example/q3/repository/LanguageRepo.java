package com.example.q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q3.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer> {
    
}
