package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.SongDto;
import com.xworkz.countryapp.dto.WashingMachineDto;

public interface WashingMachineService {
    Boolean validateAndSave(WashingMachineDto dto);

}
