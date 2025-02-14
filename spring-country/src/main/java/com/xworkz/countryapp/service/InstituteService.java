package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.InstituteDto;

public interface InstituteService {
    Boolean validateAndSave(InstituteDto instituteDto);
}
