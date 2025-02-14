package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.CountryEntity;

public interface CountryRepository {
    boolean save(CountryEntity countryEntity);
}
