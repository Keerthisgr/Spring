package com.xworkz.countryapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@ToString
public class TrainDto {
    private Integer id;
    private Integer number;
    private String name;
}
