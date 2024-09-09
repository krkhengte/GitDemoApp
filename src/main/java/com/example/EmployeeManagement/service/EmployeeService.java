package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public String deleteEmployee(String id);

    public Employee getEmployee(String id);

}
