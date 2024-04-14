package com.example.q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    
}
