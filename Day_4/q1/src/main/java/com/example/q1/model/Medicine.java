package com.example.q1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int medicineId;
    public String medicineName;    
    public String medicineFor;    
    public String manufracturedIn;  
    public double  medicinePrice;    
    public String expiryData;    
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getManufracturedIn() {
        return manufracturedIn;
    }
    public void setManufracturedIn(String manufracturedIn) {
        this.manufracturedIn = manufracturedIn;
    }
    public double getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpiryData() {
        return expiryData;
    }
    public void setExpiryData(String expiryData) {
        this.expiryData = expiryData;
    }
  
}
