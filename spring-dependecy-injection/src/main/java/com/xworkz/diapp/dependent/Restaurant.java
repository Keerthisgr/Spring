package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Restaurant {
    @Value("56")
    private int id;
    @Value("Tiptop")
    private String name;
    @Value("Non-veg")
    private String type;
    private Menu menu;
}
