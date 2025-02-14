package com.xworkz.countryapp.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DocumentDto {
    private Integer id;
    private String name;
    private Integer noOfFile;
}
