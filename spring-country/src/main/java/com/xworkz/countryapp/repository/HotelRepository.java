package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.entity.HotelEntity;

public interface HotelRepository {
    boolean save(HotelEntity entity);
}
