package com.example.gurucharanq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Address;
import com.example.gurucharanq1.repository.AddressRepo;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepository;

    public List<Address> getData(){
        return addressRepository.findAll();
    }

}
