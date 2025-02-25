package com.xworkz.userapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id ;
    private String  firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
}
