package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.dto.TelivisionDto;
import com.xworkz.countryapp.service.InstituteService;
import com.xworkz.countryapp.service.TelivisionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TelivisionRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        TelivisionService telivisionService = applicationContext.getBean(TelivisionService.class);
        TelivisionDto telivisionDto = new TelivisionDto();
        telivisionDto.setBrandName("Panasonic");
        telivisionDto.setPrice(76545.78);
        telivisionService.validateAndSave(telivisionDto);
    }
}
