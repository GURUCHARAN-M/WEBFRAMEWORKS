package com.example.q4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q4controller {
    @GetMapping("/address")
    public address addressobject(){
        address obj = new address();
        obj.setName("Rudra");
        obj.setDoorNo(000);
        obj.setStreetName("Main Street");
        obj.setPincode(000000);
        obj.setArea("sphere");
        obj.setDistrict("sun city");
        obj.setState("world of magic");
        obj.setCountry("fictional world");
        return obj;
    }

}
