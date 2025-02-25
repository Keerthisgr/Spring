package com.xworkz.diapp.dependenton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Wife {
    @Value("Usha")
    private String name;
    @Value("39")
    private int age;
    @Value("MSc")
    private String qualification;
}
