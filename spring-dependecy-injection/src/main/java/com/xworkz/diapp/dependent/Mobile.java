package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.SimCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Mobile {
    @Value("1")
    private int id;
    @Value("Mv45")
    private String modelName;
    @Value("RealMe")
    private String brandName;
    @Autowired
    private SimCard simCard;
}
