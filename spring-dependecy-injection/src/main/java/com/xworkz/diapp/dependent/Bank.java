package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Bank {
    @Value("67")
    private int id;
    @Value("Union")
    private String name;
    @Value("Sagara")
    private String branchName;
    @Autowired
    private Customer customer;
}
