package com.example.employee.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employeee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employeee> getAllEmployee() {
        return (List<Employeee>) employeeRepository.findAll();
    }

    @Override
    public Employeee updateEmployeeById(int id, Employeee employeee) {
        employeee.setId(id);
        return employeeRepository.save(employeee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employeee createEmoplyee(Employeee employee) {
        return employeeRepository.save(employee);
    }
    
}
