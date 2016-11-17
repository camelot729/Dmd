package ru.kpfu.itis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.HotelEntity;
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.form.HotelForm;

import java.util.List;
//import ru.kpfu.itis.form.HotelForm;

/**
 * Created by Kamil on 16.11.16.
 */
public interface HotelService {
    Page<HotelEntity> getAllHotel(PageRequest pageRequest);

    HotelEntity getHotelById(Integer id);
    void safeNewHotel(HotelForm form);
}

