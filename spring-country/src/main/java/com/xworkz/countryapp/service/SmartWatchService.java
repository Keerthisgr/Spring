package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.SmartWatchDto;

public interface SmartWatchService {
    Boolean validateAndSave(SmartWatchDto dto);

}
