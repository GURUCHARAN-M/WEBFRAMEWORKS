package com.example.gurucharanq1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.gurucharanq1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query("select a,e from Address a inner join Employee e on e.address=a.id")
    public List<Employee> getByInnerJoin();
    @Query("select a,e from Address a left outer join Employee e on e.address=a.id")
    public List<Employee> getByLeftOuterJoin();
}
