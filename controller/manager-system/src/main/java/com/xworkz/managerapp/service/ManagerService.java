package com.xworkz.managerapp.service;

import com.xworkz.managerapp.dto.ManagerDto;

public interface ManagerService {
    Boolean validateAndSave(ManagerDto dto);

}
