package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.service.BookService;
import com.xworkz.countryapp.service.InstituteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstituteRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        InstituteService instituteService = applicationContext.getBean(InstituteService.class);
        InstituteDto instituteDto = new InstituteDto();
        instituteDto.setName("Xworkz");
        instituteDto.setNoOfTrainee(30);
        instituteDto.setTrainerName("Devendra");
        instituteService.validateAndSave(instituteDto);
    }
}
