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
public class Ring {
    private int id;
    private String materialType;
    private String metalType;
    private double price;

    @Autowired
    public Ring(@Value("56") int id,@Value("Gold") String materialType,@Value("Gold") String metalType,@Value("67899.99") double price){
        this.id = id;
        this.materialType = materialType;
        this.metalType = metalType;
        this.price = price;
    }
}
