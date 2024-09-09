package com.example.EmployeeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {

      @Id
      private String empId;
      private String empName;
      private String  empDepartment;
      private String empBranch;

}
