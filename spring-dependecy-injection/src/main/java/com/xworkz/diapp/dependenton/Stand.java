package com.xworkz.diapp.dependenton;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Stand {
    @Value("23")
    private int id;
    @Value("Standzz")
    private String brandName;
}
