package com.example.demo1.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.demo1.pojo.Employee;
import com.example.demo1.demo1.service.EmployeeService;

@RestController
public class EmployeeController{

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/insertEmployee")
    public Employee insertEmployee(@RequestBody Employee emp){
        //Employee emp = new Employee();
        //emp.setName(empName);
        return employeeService.insertEmployee(emp);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}