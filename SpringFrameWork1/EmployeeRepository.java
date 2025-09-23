package com.example.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.project.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    
}