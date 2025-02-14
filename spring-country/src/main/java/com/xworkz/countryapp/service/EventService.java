package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.EventDto;
import com.xworkz.countryapp.dto.InstituteDto;

public interface EventService {
    Boolean validateAndSave(EventDto dto);

}
