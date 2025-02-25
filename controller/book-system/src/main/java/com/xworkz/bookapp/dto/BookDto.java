package com.xworkz.bookapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class BookDto {
    private Integer id;
    private String bookName;
    private String authorName;
    private Double price;
}
