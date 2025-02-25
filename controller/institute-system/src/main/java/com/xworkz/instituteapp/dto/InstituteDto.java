package com.xworkz.instituteapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class InstituteDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
}
