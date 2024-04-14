package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Medicine;
import com.example.q1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    public MedicineRepo medicineRepo;

    public Medicine postMediData(Medicine medObj) {
        return medicineRepo.save(medObj);
    }

    public List<Medicine> getMediData() {
        return medicineRepo.findAll();
    }
    public Medicine getOneMediData(int id) {
        return medicineRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }
}
