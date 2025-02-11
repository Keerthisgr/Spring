package com.xworkz.coreapp.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Laptop {
    @Value("67")
    private int id;
    @Value("HP")
    private String brandName;
    @Value("78900.90")
    private double price;
    @Value("Mv389")
    private String model;
}
