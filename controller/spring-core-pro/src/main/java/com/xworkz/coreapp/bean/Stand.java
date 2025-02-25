package com.xworkz.coreapp.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Stand{
 public Stand(){
  System.out.println("Stand object is created!!");
 }
 @Value("45")
 private int id;
 @Value("TMT")
 private String brandName;
 @Value("678.90")
 private double price;
}
