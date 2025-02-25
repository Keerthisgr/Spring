package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Ingrediant;
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
public class Dish {
    @Value("56")
    private int id;
    @Value("Chicken lolipop")
    private String name;
    @Value("Non-veg")
    private String type;
    @Autowired
    private Ingrediant ingrediant;
}
