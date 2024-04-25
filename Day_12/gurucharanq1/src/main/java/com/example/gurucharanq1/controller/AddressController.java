package com.example.gurucharanq1.controller;
import com.example.gurucharanq1.model.Address;
import com.example.gurucharanq1.service.AddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AddressController {
    @Autowired
    public AddressService addressService;

    @PostMapping("/address/employee/{id}")
    public List<Address> postMethodName(@PathVariable String entity) {
        return addressService.getData();
    }
    
}
