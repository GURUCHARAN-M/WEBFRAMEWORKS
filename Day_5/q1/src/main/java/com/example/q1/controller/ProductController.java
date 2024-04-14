package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Product;
import com.example.q1.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api")

public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/product")
    public Product postData(@RequestBody Product param) {
        return productService.postProductData(param);
    }
    @DeleteMapping("/product/{productId}")
    public String deleteData(@PathVariable int id) {
        productService.deleteProductData(id);
        return "Product Deleted";
    }
    @PutMapping("/product/{productId}")
    public Product putData(@PathVariable int id,@RequestBody Product param) {
        return productService.putProductData(id,param);
    }
}
