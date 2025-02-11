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
public class Telivision {
    private int id;
    private String brandName;
    private double price;

    @Autowired
    public Telivision(@Value("56") int id,@Value("Panasonic") String brandName,@Value("76900.90") double price){
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }
}
