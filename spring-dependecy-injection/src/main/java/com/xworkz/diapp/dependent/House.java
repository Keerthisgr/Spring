package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Component
public class House {
    @Value("54")
    private int id;
    @Value("567")
    private int houseNumber;
    @Value("Sadhguru")
    private String name;
    @Autowired
    private Room room;
}
