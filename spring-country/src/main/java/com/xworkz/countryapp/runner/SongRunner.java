package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.LaptopDto;
import com.xworkz.countryapp.dto.MobileDto;
import com.xworkz.countryapp.dto.SongDto;
import com.xworkz.countryapp.service.LaptopService;
import com.xworkz.countryapp.service.MobileService;
import com.xworkz.countryapp.service.SongService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SongRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SongService service = applicationContext.getBean(SongService.class);
        SongDto dto = new SongDto();
        dto.setMovieName("Mayavi");
        dto.setSingerName("Sanchith");
        service.validateAndSave(dto);
    }
}
