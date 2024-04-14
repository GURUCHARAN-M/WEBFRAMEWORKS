package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Language;
import com.example.q3.service.LanguageService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/api")
public class LanguageController
{
    @Autowired
    public LanguageService languageService;

    @PostMapping("/language")
    public Language postData(@RequestBody Language param) {
        return languageService.postLanguageData(param);
    }
    @DeleteMapping("/language/{languageId}")
    public String deleteData(@PathVariable int id) {
        languageService.deleteLanguageData(id);
        return "Language Deleted";
    }
    @PutMapping("/language/{languageId}")
    public Language putData(@PathVariable int id,@RequestBody Language param) {
        return languageService.putLanguageData(id,param);
    }  
    @GetMapping("/language")
    public List<Language> getData() {
        return languageService.getLanguageData();
    }
    @GetMapping("/language/{languageId}")
    public Language getOneData(@PathVariable int id) {
        return languageService.getOneLanguageData(id);
    }
    
}
