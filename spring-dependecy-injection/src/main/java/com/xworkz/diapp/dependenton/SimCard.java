package com.xworkz.diapp.dependenton;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component
public class SimCard {
    @Value("12")
    private int id;
    @Value("9876543210")
    private long number;
}
