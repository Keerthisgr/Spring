package com.xworkz.traineeapp.controller;

import com.xworkz.traineeapp.dto.TraineeDto;
import com.xworkz.traineeapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TrainerController {
    @Autowired
    TraineeService traineeService;

    public TrainerController(){
        System.out.println("Trainer obj created");
    }

    @RequestMapping("add")
    public String add(TraineeDto dto, Model model){
     model.addAttribute("firstName",dto.getFirstName());
     return "response.jsp";
    }
}
