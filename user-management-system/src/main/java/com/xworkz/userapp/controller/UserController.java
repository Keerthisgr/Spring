package com.xworkz.userapp.controller;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequestMapping("/")
@Component
public class UserController {

    @Autowired
    UserService userService ;

    public UserController(){
        System.out.println("UserController Object is created");
    }

    @RequestMapping("addUser")
    public String addUser(UserDto dto , Model model) throws InvocationTargetException, IllegalAccessException {
        userService.validateAndUser(dto);
        model.addAttribute("name", dto.getFirstName());
        return "response.jsp";
    }

    @RequestMapping("getAllUsers")
    public String getAllUsers(Model model) throws InvocationTargetException, IllegalAccessException {
        List<UserDto> userDtos = userService.getAllUsers();
        System.out.println(userDtos);
        model.addAttribute("listOfUsers" , userDtos);
        return "getalluser.jsp";
    }

    @RequestMapping("delete")
    public RedirectView deleteById(@RequestParam("id") String id , HttpServletRequest req){

        userService.deleteUserById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();

        redirectView.setUrl(req.getContextPath()+"/getAllUsers");
        return  redirectView;

    }

//    @RequestMapping("delete/{id}")
//    public RedirectView deleteById(@PathVariable("id") String id , HttpServletRequest req) {
//
//        userService.deleteUserById(Integer.parseInt(id));
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl(req.getContextPath() + "/getAllUsers");
//        return redirectView;
//    }
    @RequestMapping("fetchUser")
    public String fetchUserById(@RequestParam("id")String id,Model model){
        UserDto dto = userService.getUserById(Integer.parseInt(id));
        model.addAttribute("user",dto);
        return "updateuser.jsp";
    }


    @RequestMapping("userInfo")
    public String updateUser(UserDto dto,Model model) throws InvocationTargetException, IllegalAccessException {
        boolean isUserUpdated = userService.updateUser(dto);
        if(isUserUpdated)
            model.addAttribute("msg","User Data Updated Successfully");
        else
            model.addAttribute("msg","User Data Not Updated");
        return "updateuser.jsp";
    }


}
