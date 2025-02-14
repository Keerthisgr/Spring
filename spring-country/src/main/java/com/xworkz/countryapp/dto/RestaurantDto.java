package com.xworkz.countryapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;

@Data
@ToString
public class RestaurantDto {
    private Integer id;
    private String name;
    private String type;
}
