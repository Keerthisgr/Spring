package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.SongDto;
import com.xworkz.countryapp.dto.TelivisionDto;

public interface SongService {
    Boolean validateAndSave(SongDto dto);
}
