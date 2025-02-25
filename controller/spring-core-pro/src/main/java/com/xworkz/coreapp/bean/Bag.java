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
@Component("newBag")
public class Bag {
    private int id;
    private int noOfZip;
    private String brandName;
    private double price;
@Autowired
    public Bag(@Value("7") int id,@Value("4") int noOfZip,@Value("Skybags") String brandName,@Value("879.90") double price){
        this.id = id;
        this.noOfZip = noOfZip;
        this.brandName = brandName;
        this.price = price;
    }
}
