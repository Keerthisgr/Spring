package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Files;
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
public class Document {
    @Value("56")
    private int id;
    @Value("txt")
    private String type;
    @Autowired
    private Files files;
}
