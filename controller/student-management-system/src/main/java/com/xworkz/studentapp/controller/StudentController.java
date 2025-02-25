package com.xworkz.studentapp.controller;

import com.xworkz.studentapp.dto.StudentDto;
import com.xworkz.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    public  StudentController(){
        System.out.println("Student controller obj is created");
    }

    @RequestMapping("add")
    public String add(StudentDto dto, Model model){
        studentService.validateAndSaveUser(dto);
        model.addAttribute("firstName",dto.getFirstName());
        return "response.jsp";
    }
}
