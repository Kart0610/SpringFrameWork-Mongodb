package com.example.Employee.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private String _id; // MongoDB auto-generated ObjectId

    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private String location;
}
