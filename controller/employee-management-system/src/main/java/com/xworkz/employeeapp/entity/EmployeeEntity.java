package com.xworkz.employeeapp.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name = "employee_system")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;
    private String firstName;
    private String lastName;
    private String department;
    private Double salary;
}
