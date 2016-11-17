package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.HotelEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.HotelForm;
import ru.kpfu.itis.repository.HotelRepository;
import ru.kpfu.itis.service.HotelService;
import ru.kpfu.itis.util.HotelRegFormToUserTransformer;
import ru.kpfu.itis.util.StaffRegFormToUserTransformer;

import java.util.List;

/**
 * Created by Kamil on 16.11.16.
 */
@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Page<HotelEntity> getAllHotel(PageRequest pageRequest) {
        return  hotelRepository.findAll(pageRequest);
    }

    @Override
    public HotelEntity getHotelById(Integer id) {
        return hotelRepository.findOneById(id);
    }

    @Override
    public void safeNewHotel(HotelForm form) {
        HotelEntity staffEntity = HotelRegFormToUserTransformer.transform(form);
        hotelRepository.save(staffEntity);
    }
}
