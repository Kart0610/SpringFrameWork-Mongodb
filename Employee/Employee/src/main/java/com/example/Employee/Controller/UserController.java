package com.example.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.Employee_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin
public class UserController {
    
    @Autowired
    private Employee_Service service;



    @GetMapping("/displayAll")
    public ResponseEntity<?> displayAll() {
        return ResponseEntity.ok(service.getAllEmps());
    }

   @GetMapping("/displayById/{id}")
public ResponseEntity<?> displayById(@PathVariable("id") String id) {
    Employee emp = service.getEmpById(id);
    return (emp != null) ? ResponseEntity.ok(emp) : ResponseEntity.notFound().build();
}




    @PostMapping("/create")
    public ResponseEntity<?> createEmp(@RequestBody Employee emp){
        return ResponseEntity.ok(service.createEmp(emp));
    }

}