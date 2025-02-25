package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Stand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
public class Telivision {
    private int id;
    private String brandName;
    private int salary;
    private Stand stand;
}
