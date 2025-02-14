package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.dto.TelivisionDto;

public interface TelivisionService {
    Boolean validateAndSave(TelivisionDto telivisionDto);
}
