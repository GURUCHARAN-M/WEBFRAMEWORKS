package com.example.q3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Product;
import com.example.q3.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    public ProductService productService;
    @PostMapping("/product")
    public Product postData(@RequestBody Product param) {
        return productService.postProductData(param);
    }
    @GetMapping("/product")
    public List<Product> getData() {
        return productService.getProductData();
    }
    @GetMapping("/product/{productId}")
    public Product getOneData(@PathVariable int id) {
        return productService.getOneProductData(id);
    }
    
    
}
