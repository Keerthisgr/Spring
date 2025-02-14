package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.HotelDto;
import com.xworkz.countryapp.dto.RestaurantDto;

public interface RestaurantService {
    Boolean validateAndSave(RestaurantDto dto);
}
