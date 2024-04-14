package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.q1.model.Product;
import com.example.q1.repository.ProductRepo;

public class ProductService {
    @Autowired
    public ProductRepo productRepo;

    public Product postProductData(Product data){
        return productRepo.save(data);
    }
    public void deleteProductData(int id){
        productRepo.deleteById(id);
    }
    public Product putProductData(int id,Product data){
        Product a=productRepo.findById(id).orElseThrow(()->new Error("Not Found"));
        a.setProductName(data.getProductName());
        a.setProductDescription(data.getProductDescription());
        return productRepo.save(a);
    }
}
