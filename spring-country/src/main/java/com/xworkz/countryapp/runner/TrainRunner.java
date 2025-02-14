package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.TrainDto;
import com.xworkz.countryapp.service.CountryService;
import com.xworkz.countryapp.service.TrainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        TrainService service = applicationContext.getBean(TrainService.class);
        TrainDto dto = new TrainDto();
        dto.setName("Shathabdhi");
        dto.setNumber(78957);
        service.validateAndSave(dto);
    }
}
