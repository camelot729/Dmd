package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.ManagerProfileEntity;
import ru.kpfu.itis.repository.impl.ManagerProfileRepositoryImpl;
import ru.kpfu.itis.service.HotelService;
import ru.kpfu.itis.service.ManagerProfileService;
import ru.kpfu.itis.service.StaffService;

import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */
@Service
public class ManagerProfileServiceImpl implements ManagerProfileService{

    @Autowired
    ManagerProfileRepositoryImpl managerProfileRepository;

    @Autowired
    HotelService hotelService;

    @Autowired
    StaffService staffService;

    @Override
    public Integer getHotelIdByStaffId(Integer staff) {
        return managerProfileRepository.findHotelIdByStaffId(staff);
    }

    @Override
    public List<ManagerProfileEntity> getStaffIdByHotelId(Integer hotel) {
        return managerProfileRepository.findStaffIdByHotelId(hotel);
    }

    @Override
    public void safeNewManagerProfile(Integer hotelId, Integer staffId) {

        ManagerProfileEntity managerProfileEntity = new ManagerProfileEntity();
        managerProfileEntity.setHotel(hotelId);
        managerProfileEntity.setStaff(staffId);
        managerProfileRepository.save(managerProfileEntity);

    }
}
