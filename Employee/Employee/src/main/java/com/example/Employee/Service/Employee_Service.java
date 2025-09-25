package com.example.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepo;


@Service
public class Employee_Service {

	@Autowired
	private EmployeeRepo repo;

    //Get All Employees
    public Object getAllEmps(){
        return repo.findAll();
    }

    //Get Employee by ID
    public Employee getEmpById(String employeeId) {
    return repo.findByEmployeeid(employeeId).orElse(null);
}



    //Create New Employee
    public Employee createEmp(Employee emp) {
    return repo.save(emp);
}

}