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
public class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

    @Autowired
    public Product(@Value("789") int productId,@Value("SmartPhone") String productName,@Value("Electronic gadgets") String category,@Value("6788.90") double price){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }
}
