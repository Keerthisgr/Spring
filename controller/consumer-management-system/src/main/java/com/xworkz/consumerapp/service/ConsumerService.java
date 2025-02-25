package com.xworkz.consumerapp.service;


import com.xworkz.consumerapp.dto.ConsumerDto;

public interface ConsumerService {
    Boolean validateAndSave(ConsumerDto dto);

}
