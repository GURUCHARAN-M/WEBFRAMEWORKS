package com.example.gurucharanq2.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    public int id;

    public String name;
    public int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentDetail")
    public StudentDetail studentDetail;
}
