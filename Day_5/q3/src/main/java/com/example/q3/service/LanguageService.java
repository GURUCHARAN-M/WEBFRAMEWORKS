package com.example.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.q3.model.Language;
import com.example.q3.repository.LanguageRepo;

public class LanguageService {
    @Autowired
    public LanguageRepo languageRepo;

    public Language postLanguageData(Language data){
        return languageRepo.save(data);
    }
    public void deleteLanguageData(int id){
        languageRepo.deleteById(id);
    }
    public Language putLanguageData(int id,Language data){
        Language a=languageRepo.findById(id).orElseThrow(()->new Error("Not Found"));
        a.setLanguageName(data.getLanguageName());
        a.setLanguageComplexity(data.getLanguageComplexity());
        return languageRepo.save(a);
    }
    public List<Language> getLanguageData(){
        return languageRepo.findAll();
    }
    public Language getOneLanguageData(int id){
        return languageRepo.findById(id).orElseThrow(()->new Error("Not Found"));
    }
}
