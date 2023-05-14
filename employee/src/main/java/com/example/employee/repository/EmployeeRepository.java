package com.example.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employeee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employeee, Integer>{
}
