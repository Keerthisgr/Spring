package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.DocumentDto;
import com.xworkz.countryapp.dto.TrainDto;
import com.xworkz.countryapp.service.DocumentService;
import com.xworkz.countryapp.service.TrainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DocumentRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        DocumentService service = applicationContext.getBean(DocumentService.class);
        DocumentDto dto = new DocumentDto();
        dto.setName("Word");
        dto.setNoOfFile(456);
        service.validateAndSave(dto);
    }
}
