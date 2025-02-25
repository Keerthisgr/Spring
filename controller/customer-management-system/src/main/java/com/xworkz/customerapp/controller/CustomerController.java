package com.xworkz.customerapp.controller;

import com.xworkz.customerapp.dto.CustomerDto;
import com.xworkz.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    public CustomerController(){
        System.out.println("Customer object created");
    }

    @RequestMapping("add")
    public String add(CustomerDto dto, Model model){
        model.addAttribute("firstName",dto.getFirstName());
        return "response.jsp";
    }
}
