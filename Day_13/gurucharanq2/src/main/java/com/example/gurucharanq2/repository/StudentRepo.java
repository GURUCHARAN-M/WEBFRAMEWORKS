package com.example.gurucharanq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
