package com.example.EmployeeManagement.service.impl;

import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.repository.EmployeeRepo;
import com.example.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;



    @Override
    public Employee saveEmployee(Employee employee) {
        String string = UUID.randomUUID().toString();
        employee.setEmpId(string);
        Employee save = employeeRepo.save(employee);
        return save;
    }

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> all = employeeRepo.findAll();
        return all;
    }

    @Override
    public String deleteEmployee(String id) {

        employeeRepo.deleteById(id);

        return "Employee Deleted";
    }

    @Override
    public Employee getEmployee(String id) {

        Optional<Employee> byId = employeeRepo.findById(id);
        Employee employee = byId.get();
        return employee;
    }
}

