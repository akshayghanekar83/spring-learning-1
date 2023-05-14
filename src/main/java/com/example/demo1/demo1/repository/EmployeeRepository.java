package com.example.demo1.demo1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo1.demo1.pojo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,String> {
    
}
