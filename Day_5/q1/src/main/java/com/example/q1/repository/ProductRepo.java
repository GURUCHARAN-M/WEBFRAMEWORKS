package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q1.model.Product;

public interface ProductRepo extends JpaRepository <Product,Integer> {

}
