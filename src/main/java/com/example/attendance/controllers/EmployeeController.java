package com.example.attendance.controllers;

import com.example.attendance.dtos.RegisterEmployee;
import com.example.attendance.entity.Employee;
import com.example.attendance.repositories.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/employee")
@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public ResponseEntity findAll() {
        try{
            final List<Employee> employees = employeeRepository.findAll();
            return ResponseEntity.ok(employees);
        }
        catch(Exception e){
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity save(@RequestBody RegisterEmployee employee){
        try{

            final Employee newEmployee = new Employee();
            newEmployee.setName(employee.getName());
            var saveEmployee = employeeRepository.save(newEmployee);
            return ResponseEntity.ok(saveEmployee);
        }
        catch(Exception e){
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

}
