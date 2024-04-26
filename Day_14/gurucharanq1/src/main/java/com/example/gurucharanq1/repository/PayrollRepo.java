package com.example.gurucharanq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq1.model.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll,Integer> {

}
