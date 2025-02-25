package com.xworkz.diapp.dependenton;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Medicine {
    @Value("45")
    private int id;
    @Value("Paracetomol")
    private String name;
}
