package com.example.gurucharanq2.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class StudentDetail {
    @Id
    public int id;

    public String address;
    public String phoneNumber;

}
