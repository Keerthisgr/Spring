package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Wife;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Husband {
    @Value("Ramesh")
    private String name;
    @Value("45")
    private int age;
    @Value("MBA")
    private String qualification;
    @Value("45000")
    private int salary;
    @Autowired
    private Wife wife;
}
