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
public class TShirt {
    @Value("6")
    private int id;
    @Value("Puma")
    private String brandName;
    @Value("789.90")
    private double price;

//    @Autowired
//    public TShirt(@Value("56") int id,@Value("Puma") String brandName,@Value("670.90") double price){
//        this.id = id;
//        this.brandName = brandName;
//        this.price = price;
//    }
}
