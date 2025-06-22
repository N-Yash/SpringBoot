package com.va.week8.jpawithrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
    EmployeeRepository empRepository;

// Get All Employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

// Add a new employee
    @PostMapping("/employee")
    public Employee addEmployee(@Validated @RequestBody Employee emp) {
        return empRepository.save(emp);
    }
}