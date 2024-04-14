package com.example.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q2.model.Job;
import com.example.q2.repository.JobRepo;


@Service
public class JobService {
    
    @Autowired
    public JobRepo jobRepo;

    public Job postJobData(Job data){
        return jobRepo.save(data);
    }
    public List<Job> getJobData(){
        return jobRepo.findAll();
    }
    public Job getOneJobData(int id){
        return jobRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }
}
