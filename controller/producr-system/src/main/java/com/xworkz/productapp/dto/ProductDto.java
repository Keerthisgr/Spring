package com.xworkz.productapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ProductDto {
    private Integer id;
    private String name;
    private String brand;
    private Double price;
}
