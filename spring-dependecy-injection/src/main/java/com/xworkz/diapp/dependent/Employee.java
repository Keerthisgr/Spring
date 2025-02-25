package com.xworkz.diapp.dependent;


import com.xworkz.diapp.dependenton.LaptopIssued;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Employee {
    @Value("67")
    private  int id;
    @Value("Suresh")
    private String employeeName;
    @Value("28")
    private int age;
    @Autowired
    private LaptopIssued laptop;
}
