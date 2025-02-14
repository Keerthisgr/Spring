package com.xworkz.countryapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;

@Data
@ToString
public class EventDto {
    private Integer id;
    private String type;
    private Integer noOfDays;
}
