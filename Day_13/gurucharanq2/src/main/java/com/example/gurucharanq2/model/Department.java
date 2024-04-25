package com.example.gurucharanq2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {
    @Id
    public int departmentId;
    public String departmentName;
    public String departmentEmail;
    public String headOfDepartment;
}
