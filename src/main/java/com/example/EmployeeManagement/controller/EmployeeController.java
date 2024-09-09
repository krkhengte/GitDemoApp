package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmp")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

        Employee employee1 = employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(employee1);

    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> allEmployee = employeeService.getAllEmployee();

        return ResponseEntity.status(HttpStatus.OK).body(allEmployee);

    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String id){
        String s = employeeService.deleteEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(s);
    }

    @GetMapping("/getEmployeeByID/{id}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable String id){
        Employee employee = employeeService.getEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

}
