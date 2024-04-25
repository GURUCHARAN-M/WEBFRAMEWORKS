package com.example.gurucharanq2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.gurucharanq2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

     @Query("select a,e from StudentDetail a inner join Student e on e.address=a.id")
    public List<Student> getByInnerJoin();
    @Query("select a,e from StudentDetail a left outer join Student e on e.address=a.id")
    public List<Student> getByLeftOuterJoin();
}
