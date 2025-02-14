package com.xworkz.countryapp.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class InstituteDto {
    private Integer id;
    private String name;
    private Integer noOfTrainee;
    private String trainerName;
}
