package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employeee;
import com.example.employee.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    
    @PostMapping(value = "/create")
    public ResponseEntity<Employeee> createEmployee(@RequestBody Employeee employeee) {
        return ResponseEntity.ok(employeeService.createEmoplyee(employeee));
    }

    @PutMapping(value = "/update/{id}")
    public Employeee updateEmployeeById(@PathVariable int id, @RequestBody Employeee employeee) {
        return employeeService.updateEmployeeById(id, employeee);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        employeeService.deleteEmployeeById(id);
    }

    @GetMapping(value = "/get") 
    public List<Employeee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
}
