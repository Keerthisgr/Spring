package com.xworkz.coreapp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component
public class Chair {
    @Value("56")
    private int id;
    @Value("Usha")
    private String brandName;
    @Value("987.90")
    private double price;
}
