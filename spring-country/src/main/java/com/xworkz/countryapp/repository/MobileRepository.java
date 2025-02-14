package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.entity.MobileEntity;

public interface MobileRepository {
    boolean save(MobileEntity entity);
}
