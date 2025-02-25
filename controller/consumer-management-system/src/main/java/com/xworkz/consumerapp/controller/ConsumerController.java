package com.xworkz.consumerapp.controller;

import com.xworkz.consumerapp.dto.ConsumerDto;
import com.xworkz.consumerapp.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ConsumerController {
    @Autowired
    ConsumerService service;

    public ConsumerController(){
        System.out.println("Trainer obj created");
    }

    @RequestMapping("add")
    public String add(ConsumerDto dto, Model model){
     model.addAttribute("firstName",dto.getFirstName());
     return "response.jsp";
    }
}
