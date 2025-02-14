package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.DocumentDto;
import com.xworkz.countryapp.dto.LaptopDto;

public interface DocumentService {
    Boolean validateAndSave(DocumentDto dto);
}
