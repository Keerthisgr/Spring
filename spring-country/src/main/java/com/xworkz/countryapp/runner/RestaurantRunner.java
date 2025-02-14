package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.HotelDto;
import com.xworkz.countryapp.dto.RestaurantDto;
import com.xworkz.countryapp.service.HotelService;
import com.xworkz.countryapp.service.RestaurantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestaurantRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        RestaurantService service = applicationContext.getBean(RestaurantService.class);
        RestaurantDto dto = new RestaurantDto();
        dto.setName("Sagara");
        dto.setType("NonVeg");
        service.validateAndSave(dto);
    }
}
