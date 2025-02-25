package com.xworkz.managerapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ManagerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String department;
}
