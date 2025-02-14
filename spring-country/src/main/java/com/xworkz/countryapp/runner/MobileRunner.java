package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.MobileDto;
import com.xworkz.countryapp.dto.TelivisionDto;
import com.xworkz.countryapp.service.MobileService;
import com.xworkz.countryapp.service.TelivisionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MobileService service = applicationContext.getBean(MobileService.class);
        MobileDto dto = new MobileDto();
        dto.setBrandName("Realme");
        dto.setPrice(16900.90);
        service.validateAndSave(dto);

    }
}
