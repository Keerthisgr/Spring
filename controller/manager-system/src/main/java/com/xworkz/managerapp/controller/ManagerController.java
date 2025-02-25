package com.xworkz.managerapp.controller;

import com.xworkz.managerapp.dto.ManagerDto;
import com.xworkz.managerapp.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ManagerController {
    @Autowired
    ManagerService service;

    public ManagerController(){
        System.out.println("Trainer obj created");
    }

    @RequestMapping("add")
    public String add(ManagerDto dto, Model model){
     model.addAttribute("firstName",dto.getFirstName());
     return "response.jsp";
    }
}
