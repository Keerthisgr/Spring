package com.xworkz.countryapp.singleton;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class Person {
    private int id;
    private String name;
    private long phoneNo;
    private String email;
}
