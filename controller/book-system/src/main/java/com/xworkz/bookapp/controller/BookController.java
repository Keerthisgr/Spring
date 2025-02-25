package com.xworkz.bookapp.controller;

import com.xworkz.bookapp.dto.BookDto;
import com.xworkz.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Component
@RequestMapping("/")
public class BookController {
    @Autowired
    BookService service;

    public BookController(){
        System.out.println("Book object created");
    }

    @RequestMapping("add")
    public String add(BookDto dto, Model model){
        model.addAttribute("bookName", dto.getBookName());
        return "response.jsp";
    }
}
