package com.xworkz.coreapp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component
public class Chair {
    private int id;
    private String brandName;
    private double price;
}
