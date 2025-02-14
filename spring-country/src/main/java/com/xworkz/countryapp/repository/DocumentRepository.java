package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.DocumentEntity;
import com.xworkz.countryapp.entity.TrainEntity;

public interface DocumentRepository {
    boolean save(DocumentEntity entity);
}
