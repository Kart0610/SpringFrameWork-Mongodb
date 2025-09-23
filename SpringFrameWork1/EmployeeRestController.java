package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.project.model.Employee;
import com.example.project.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by id
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeRepository.findById(id);
    }
 // Update employe
    @PostMapping
public Employee addEmployee(@RequestBody Employee employee) {
    return employeeRepository.save(employee);
}

    // Delete employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeRepository.deleteById(id);
    }
}