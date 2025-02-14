package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.EventDto;
import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.service.EventService;
import com.xworkz.countryapp.service.InstituteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        EventService service = applicationContext.getBean(EventService.class);
        EventDto dto = new EventDto();
        dto.setType("Holiday");
        dto.setNoOfDays(3);
        service.validateAndSave(dto);
    }
}
