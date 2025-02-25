package com.xworkz.employeeapp.controller;

import com.xworkz.employeeapp.dto.EmployeeDto;
import com.xworkz.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    public EmployeeController(){
        System.out.println("Trainer obj created");
    }

    @RequestMapping("add")
    public String add(EmployeeDto dto, Model model){
     model.addAttribute("firstName",dto.getFirstName());
     return "response.jsp";
    }
}
