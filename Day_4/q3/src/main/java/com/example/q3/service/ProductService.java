package com.example.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q3.model.Product;
import com.example.q3.repository.ProductRepo;


@Service
public class ProductService {
    
    @Autowired
    public ProductRepo productRepo;

    public Product postProductData(Product data){
        return productRepo.save(data);
    }
    public List<Product> getProductData(){
        return productRepo.findAll();
    }
    public Product getOneProductData(int id){
        return productRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }
}