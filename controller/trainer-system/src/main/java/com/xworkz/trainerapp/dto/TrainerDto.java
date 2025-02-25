package com.xworkz.trainerapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class TrainerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String batch;
}
