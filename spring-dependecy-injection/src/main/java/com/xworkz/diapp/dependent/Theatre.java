package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Theatre {
    @Value("67")
    private int id;
    @Value("Vishal")
    private String name;
    @Value("175")
    private int noOfSeats;
    @Autowired
    private Movie movie;
}
