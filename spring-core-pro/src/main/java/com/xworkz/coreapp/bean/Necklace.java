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
public class Necklace {
    private int id;
    private String metalName;
    private double price;

    @Autowired
    public Necklace(@Value("34") int id,@Value("Gold") String metalName,@Value("67000.99") double price){
        this.id = id;
        this.metalName = metalName;
        this.price = price;
    }
}
