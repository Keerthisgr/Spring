package com.xworkz.countryapp.politician;

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
public class Politician {
    @Value("4")
    private int id;
    @Value("Tejaswi Surya")
    private String politicianName;
}
