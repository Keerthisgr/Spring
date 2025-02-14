package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.HotelDto;

public interface HotelService {
    Boolean validateAndSave(HotelDto dto);

}
