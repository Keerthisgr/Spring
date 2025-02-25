package com.xworkz.userapp.controller;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class UserController {
    @Autowired
    UserService userService;

    public UserController() {
        System.out.println("UserController obj is created");
    }


    @RequestMapping("addUser")
//    @PostMapping("addUser")
    public String addUser(UserDto dto, Model model){
        userService.validateAndSaveUser(dto);
        model.addAttribute("userName",dto.getFirstName());
        return "response.jsp"; // send view
    }
}
