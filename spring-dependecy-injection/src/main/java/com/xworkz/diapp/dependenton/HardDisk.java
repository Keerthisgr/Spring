package com.xworkz.diapp.dependenton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class HardDisk {
    @Value("34")
    private int id;
    @Value("500GB")
    private String storageCapacity;
}
