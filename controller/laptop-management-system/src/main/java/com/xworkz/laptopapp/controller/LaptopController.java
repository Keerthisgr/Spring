package com.xworkz.laptopapp.controller;

import com.xworkz.laptopapp.dto.LaptopDto;
import com.xworkz.laptopapp.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    public LaptopController(){
        System.out.println("Laptop obj is created");
    }
    @RequestMapping("addLaptop")
    public String addLaptop(LaptopDto dto, Model model){
        laptopService.validateAndSave(dto);
        model.addAttribute("brandName",dto.getBrandName());
        return "response.jsp";
    }
}
