package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Value("1")
    private int id;
    @Value("Ramesh")
    private String name;
    @Value("45")
    private int age;
    @Value("9876543210")
    private long mobileNumber;
    @Value("Viral fever")
    private String disease;
    @Autowired
    private Address address;
}
