package com.xworkz.customerapp.repository;

import com.xworkz.customerapp.entity.CustomerEntity;

public interface CustomerRepository {
    Boolean save(CustomerEntity entity);

}
