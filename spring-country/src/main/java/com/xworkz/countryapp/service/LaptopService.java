package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.LaptopDto;

public interface LaptopService {
    Boolean validateAndSave(LaptopDto dto);
}
