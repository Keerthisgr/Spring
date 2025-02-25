package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Medicine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MedicalShop {
    private int id;
    private String name;
    private String type;
    private Medicine medicine;
}
