package com.xworkz.customerapp.service;

import com.xworkz.customerapp.dto.CustomerDto;
import com.xworkz.customerapp.repository.CustomerRepository;

public interface CustomerService {
    Boolean validateAndSave(CustomerDto dto);

}
