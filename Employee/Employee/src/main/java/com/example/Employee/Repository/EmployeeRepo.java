package com.example.Employee.Repository;

import com.example.Employee.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
    Optional<Employee> findByEmployeeid(String employeeId);
}

