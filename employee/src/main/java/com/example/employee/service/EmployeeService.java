package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employeee;

public interface EmployeeService {
    
    public List<Employeee> getAllEmployee();

    public Employeee updateEmployeeById(int id, Employeee employeee);

    public void deleteEmployeeById(int id);

    public Employeee createEmoplyee(Employeee employee);
}
