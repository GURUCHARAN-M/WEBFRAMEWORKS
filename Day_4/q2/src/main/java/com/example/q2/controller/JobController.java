package com.example.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Job;
import com.example.q2.service.JobService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class JobController {
    @Autowired
    public JobService jobService;
    @PostMapping("/job")
    public Job postData(@RequestBody Job param) {
        return jobService.postJobData(param);
    }
    @GetMapping("/job")
    public List<Job> getData() {
        return jobService.getJobData();
    }
    @GetMapping("/job/{jobId}")
    public Job getOneData(@PathVariable int id) {
        return jobService.getOneJobData(id);
    }
    
    

}
