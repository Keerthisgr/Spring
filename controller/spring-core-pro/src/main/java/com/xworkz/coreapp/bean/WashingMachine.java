package com.xworkz.coreapp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
@Component
public class WashingMachine {
//    @Value("56")
    private int id;
    @Value("SHY")
    private String brandName;
    @Value("789.90")
    private double price;
    @Autowired
    public WashingMachine(@Value("234") int id,@Value("LG") String brandName,@Value("87654.99") double price){
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }
}
