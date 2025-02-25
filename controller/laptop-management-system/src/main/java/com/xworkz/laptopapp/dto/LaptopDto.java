package com.xworkz.laptopapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LaptopDto {
    private Integer id;
    private String brandName;
    private String model;
    private Double price;
}
