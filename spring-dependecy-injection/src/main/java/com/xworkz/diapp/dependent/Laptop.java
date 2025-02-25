package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.HardDisk;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Laptop {
    @Value("23")
    private int id;
    @Value("Dell")
    private String brandName;
    @Value("89000")
    private int price;
    @Autowired
    private HardDisk hardDisk;
}
