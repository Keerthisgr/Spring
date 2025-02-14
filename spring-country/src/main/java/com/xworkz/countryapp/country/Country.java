package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.Politician;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Country {
    @Value("76")
    private int id;
    @Value("India")
    private String name;
    @Value("29")
    private int noOfStates;
    @Value("1400000000")
    private long population;
    @Autowired
    private Politician politician;
}
