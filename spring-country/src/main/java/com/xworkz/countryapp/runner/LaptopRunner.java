package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.LaptopDto;
import com.xworkz.countryapp.dto.TelivisionDto;
import com.xworkz.countryapp.service.LaptopService;
import com.xworkz.countryapp.service.TelivisionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        LaptopService service = applicationContext.getBean(LaptopService.class);
        LaptopDto dto = new LaptopDto();
        dto.setBrandName("Dell");
        dto.setPrice(98789.99);
        service.validateAndSave(dto);

    }
}
