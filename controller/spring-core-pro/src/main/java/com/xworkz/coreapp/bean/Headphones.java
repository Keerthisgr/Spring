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
public class Headphones {
    @Value("56")
    private int id;
    @Value("Oneplus")
    private String brandName;
    @Value("Electronic gadgets")
    private String type;
    @Value("2500.90")
    private double price;
}
