package ru.kpfu.itis.service;

import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */
public interface ManagerProfileService {

    Integer getHotelIdByStaffId(Integer staff);
    List getStaffIdByHotelId(Integer hotel);
    void safeNewManagerProfile(Integer hotelId, Integer staffId);
}
