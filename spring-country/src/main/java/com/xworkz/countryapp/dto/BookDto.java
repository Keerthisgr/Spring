package com.xworkz.countryapp.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BookDto {
    private Integer id;
    private String bookName;
    private String authorName;
    private Double price;
}
