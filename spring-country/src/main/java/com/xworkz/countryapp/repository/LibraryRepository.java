package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.entity.LibraryEntity;

public interface LibraryRepository {
    boolean save(LibraryEntity entity);
}
