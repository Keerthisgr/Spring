package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Lyrics;
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
public class Song {
    @Value("34")
    private int id;
    @Value("Olave olave")
    private String singerName;
    @Autowired
    private Lyrics lyrics;
}
