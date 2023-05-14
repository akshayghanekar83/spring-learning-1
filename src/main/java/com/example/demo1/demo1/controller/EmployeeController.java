package com.example.demo1.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee emp){
        return employeeService.updateEmployee(emp);
    }

    @GetMapping("/getEmployee/{empId}")
    public Employee findEmployee(@PathVariable("empId")String empId){
        return employeeService.findEmployee(empId);
    }

    @DeleteMapping("/deleteEmployee/{empId}")
    public Employee deleteEmployee(@PathVariable("empId")String empId){
        return employeeService.deleteEmployee(empId);
    }

}