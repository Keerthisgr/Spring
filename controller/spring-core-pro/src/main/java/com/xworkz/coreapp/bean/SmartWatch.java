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
public class SmartWatch {
    @Value("567")
    private int id;
    @Value("Noise")
    private String brandName;
    @Value("Mv897")
    private String modelName;
    @Value("5600.90")
    private double price;
}
