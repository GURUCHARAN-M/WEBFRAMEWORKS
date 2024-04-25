package com.example.gurucharanq2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    public int studentId;

    public String name;
    public String email;
    public int age;

    @ManyToOne
    public Department department;
    

}
