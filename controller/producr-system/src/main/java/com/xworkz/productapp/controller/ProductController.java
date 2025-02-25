package com.xworkz.productapp.controller;

import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProductController {
    @Autowired
    ProductService service;

    public ProductController(){
        System.out.println("Customer object created");
    }

    @RequestMapping("add")
    public String add(ProductDto dto, Model model){
        model.addAttribute("name",dto.getName());
        return "response.jsp";
    }
}
