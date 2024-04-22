package com.example.gurucharanq2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gurucharanq2.model.Course;
import com.example.gurucharanq2.repository.CourseRepo;

@Service
public class CourseService {
    @Autowired
    public CourseRepo courseRepo;

    public List<Course> getData(){
        return courseRepo.findAll();
    }    
    public List<Course> getDataByName(String name){
        return courseRepo.findByCourseName(name);
    }    
    public Course postData(Course p){
        return courseRepo.save(p);
    }

}
