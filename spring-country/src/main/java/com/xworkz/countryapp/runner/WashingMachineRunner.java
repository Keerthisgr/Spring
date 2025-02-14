package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.SmartWatchDto;
import com.xworkz.countryapp.dto.WashingMachineDto;
import com.xworkz.countryapp.service.SmartWatchService;
import com.xworkz.countryapp.service.WashingMachineService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WashingMachineRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        WashingMachineService service = applicationContext.getBean(WashingMachineService.class);
        WashingMachineDto dto = new WashingMachineDto();
        dto.setBrandName("LG");
        dto.setPrice(72690.90);
        service.validateAndSave(dto);
    }
}
