package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.MobileDto;
import com.xworkz.countryapp.dto.SmartWatchDto;
import com.xworkz.countryapp.service.MobileService;
import com.xworkz.countryapp.service.SmartWatchService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SmartWatchRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SmartWatchService service = applicationContext.getBean(SmartWatchService.class);
        SmartWatchDto dto = new SmartWatchDto();
        dto.setBrandName("Noise");
        dto.setPrice(2690.90);
        service.validateAndSave(dto);
    }
}
