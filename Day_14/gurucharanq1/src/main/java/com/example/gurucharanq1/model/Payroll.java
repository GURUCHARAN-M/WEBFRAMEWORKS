package com.example.gurucharanq1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Payroll {


    @Id
    public long payrollId;
    public double amount;
    public int noOfDaysWorked;
    
}
