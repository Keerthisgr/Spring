package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.EventEntity;
import com.xworkz.countryapp.entity.InstituteEntity;

public interface EventRepository {
    boolean save(EventEntity entity);

}
