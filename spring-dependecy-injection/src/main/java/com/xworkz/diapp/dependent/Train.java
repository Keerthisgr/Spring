package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Coaches;
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
public class Train {
    @Value("82")
    private int id;
    @Value("Shathabdi")
    private String name;
    @Autowired
    private Coaches coaches;
}
