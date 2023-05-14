package com.example.demo1.demo1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    public List<Employee> getAllEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
        employeeRepository.findAll().iterator().forEachRemaining(empList::add);
        return empList;
    }

    public Employee updateEmployee(Employee emp){
        employeeRepository.save(emp);
        return emp;
    }

    public Employee findEmployee(String empId){
        return employeeRepository.findById(empId).get();
    }

    public Employee deleteEmployee(String empId){
        Employee emp = findEmployee(empId);
        employeeRepository.deleteById(empId);
        return emp;
    }

}
