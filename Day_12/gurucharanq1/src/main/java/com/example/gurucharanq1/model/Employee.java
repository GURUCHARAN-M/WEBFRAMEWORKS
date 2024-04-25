package com.example.gurucharanq1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    public int id;
    
    public String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    public Address address;
}
