package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.MobileDto;

public interface MobileService {
    Boolean validateAndSave(MobileDto dto);

}
