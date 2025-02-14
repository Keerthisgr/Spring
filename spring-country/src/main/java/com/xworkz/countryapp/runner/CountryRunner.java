package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.country.Country;
import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CountryService countryService = applicationContext.getBean(CountryService.class);
        CountryDto countryDto = new CountryDto();
        countryDto.setName("India");
        countryDto.setNoOfStates(28);
        countryDto.setPopulation(1400000000l);
        countryService.validateAndSave(countryDto);
    }
}
