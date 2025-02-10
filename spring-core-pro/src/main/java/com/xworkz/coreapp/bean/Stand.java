package com.xworkz.coreapp.bean;

import lombok.*;
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
 private int id;
 private String brandName;
 private double price;
}
