package com.example.demo1.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.demo1.pojo.Employee;
import com.example.demo1.demo1.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    public Employee insertEmployee(Employee emp){
        employeeRepository.save(emp);
        return emp;
    }

}
