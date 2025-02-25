package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Library {
    @Value("1")
    private int id;
    @Value("Sharavathi")
    private String name;
    @Value("Private")
    private String type;
    @Value("25000")
    private int noOfBooks;
    @Autowired
    private Book book;
}
