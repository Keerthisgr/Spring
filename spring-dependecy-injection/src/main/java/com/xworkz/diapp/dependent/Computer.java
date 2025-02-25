package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Processor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Component
public class Computer {
    @Value("78")
    private int id;
    @Value("HP")
    private String brandName;
    @Value("98765")
    private int price;
    @Autowired
    private Processor processor;
}
