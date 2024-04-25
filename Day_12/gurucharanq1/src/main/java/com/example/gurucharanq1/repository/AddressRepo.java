package com.example.gurucharanq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq1.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
