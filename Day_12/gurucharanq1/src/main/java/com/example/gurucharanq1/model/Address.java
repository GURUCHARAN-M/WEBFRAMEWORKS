package com.example.gurucharanq1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    
    @Id
    public int id;

    public String street;
    public String city;

}
