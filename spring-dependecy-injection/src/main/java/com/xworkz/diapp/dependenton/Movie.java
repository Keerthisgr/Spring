package com.xworkz.diapp.dependenton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Movie {
    @Value("89")
    private int id;
    @Value("UI")
    private String movieName;
}
