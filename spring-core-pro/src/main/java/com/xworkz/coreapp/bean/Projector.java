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
public class Projector {
    private int id;
    private String type;
    private String brandName;
    private double price;

    @Autowired
    public Projector(@Value("56") int id,@Value("Electronic gadget") String type,@Value("Vexon") String brandName,@Value("76899.99") double price){
        this.id = id;
        this.type = type;
        this.brandName = brandName;
        this.price = price;
    }
}
