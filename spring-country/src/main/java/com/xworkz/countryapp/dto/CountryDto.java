package com.xworkz.countryapp.dto;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
@Data
@ToString

public class CountryDto {
    private Integer id;
    private String name;
    private Integer noOfStates;
    private Long population;
}
