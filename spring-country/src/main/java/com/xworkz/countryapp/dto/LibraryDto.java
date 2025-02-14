package com.xworkz.countryapp.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LibraryDto {
    private Integer id;
    private String name;
    private String type;
    private Integer noOfBooks;
}
