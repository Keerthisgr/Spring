package com.xworkz.diapp.dependent;

import com.xworkz.diapp.dependenton.Product;
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
public class Ecommerce {
    @Value("61")
    private int id;
    @Value("Amazon")
    private String appName;
    @Autowired
    private Product product;
}
