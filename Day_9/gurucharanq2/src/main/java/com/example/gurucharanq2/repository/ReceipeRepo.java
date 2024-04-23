package com.example.gurucharanq2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


import com.example.gurucharanq2.model.Receipe;

public interface ReceipeRepo extends JpaRepository<Receipe,Integer> {
    
    @Query("SELECT u FROM Receipe u WHERE u.name = :name")
    public List<Receipe> getByName(String name);
    
}
