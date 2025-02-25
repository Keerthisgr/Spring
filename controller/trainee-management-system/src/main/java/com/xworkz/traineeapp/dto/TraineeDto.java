package com.xworkz.traineeapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class TraineeDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String batch;
    private String trainerName;
}
