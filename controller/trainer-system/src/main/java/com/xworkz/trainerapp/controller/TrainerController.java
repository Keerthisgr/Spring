package com.xworkz.trainerapp.controller;

import com.xworkz.trainerapp.dto.TrainerDto;
import com.xworkz.trainerapp.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TrainerController {
    @Autowired
    TrainerService traineeService;

    public TrainerController(){
        System.out.println("Trainer obj created");
    }

    @RequestMapping("add")
    public String add(TrainerDto dto, Model model){
     model.addAttribute("firstName",dto.getFirstName());
     return "response.jsp";
    }
}
