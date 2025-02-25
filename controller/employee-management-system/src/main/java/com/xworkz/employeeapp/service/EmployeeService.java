package com.xworkz.employeeapp.service;

import com.xworkz.employeeapp.dto.EmployeeDto;

public interface EmployeeService {
    Boolean validateAndSave(EmployeeDto dto);

}
