package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.LaptopDto;
import com.xworkz.countryapp.dto.TrainDto;

public interface TrainService {
    Boolean validateAndSave(TrainDto dto);
}
