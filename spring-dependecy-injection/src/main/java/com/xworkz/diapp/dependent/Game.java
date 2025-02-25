package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Players;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Game {
    @Value("48")
    private int id;
    @Value("Cricket")
    private String name;
    @Value("Virat Kohli")
    private String captain;
    @Autowired
    private Players players;
}
