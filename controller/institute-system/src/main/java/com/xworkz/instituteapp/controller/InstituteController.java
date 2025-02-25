package com.xworkz.instituteapp.controller;

import com.xworkz.instituteapp.dto.InstituteDto;
import com.xworkz.instituteapp.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class InstituteController {
    @Autowired
    InstituteService instituteService;

    public InstituteController(){
        System.out.println("Institute Object is created");
    }

    @RequestMapping("add")
    public String add(InstituteDto dto, Model model){
        model.addAttribute("firstName",dto.getFirstName());
        return "response.jsp";
    }
}
