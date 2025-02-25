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
public class Bottle {
    @Value("2")
    private int id;
    @Value("Xzor")
    private String brandName;
    @Value("!ltr")
    private String capacity;
    @Value("876.90")
    private double price;
}
