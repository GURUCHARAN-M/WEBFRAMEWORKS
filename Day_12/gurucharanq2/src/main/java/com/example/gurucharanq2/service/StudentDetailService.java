package com.example.gurucharanq2.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq2.model.StudentDetail;
// import com.example.gurucharanq2.model.StudentDetail;
import com.example.gurucharanq2.repository.StudentDetailRepo;

@Service
public class StudentDetailService {
    @Autowired
    private StudentDetailRepo addressRepository;

    public List<StudentDetail> getData(){
        return addressRepository.findAll();
    }

}
