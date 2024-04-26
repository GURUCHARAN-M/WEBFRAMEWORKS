package com.example.gurucharanq1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    public long employeeId;
    public String employeeName;
    public int age;
    public long mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payroll")
    public Payroll payroll;

}
