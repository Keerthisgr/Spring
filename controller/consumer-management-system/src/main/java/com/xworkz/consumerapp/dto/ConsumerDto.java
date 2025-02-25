package com.xworkz.consumerapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ConsumerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String emailId;
}
