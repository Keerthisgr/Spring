package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.HotelDto;
import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.service.HotelService;
import com.xworkz.countryapp.service.InstituteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HotelService service = applicationContext.getBean(HotelService.class);
        HotelDto dto = new HotelDto();
        dto.setName("Sagara");
        dto.setType("NonVeg");
        service.validateAndSave(dto);
    }
}
