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
public class Microwaves {
    private int id;
    private String brandName;
    private double price;

    @Autowired
    public Microwaves(@Value("56") int id,@Value("LG") String brandName,@Value("67450.90") double price){
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }
}
