package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.RoomCategoryEntity;

import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */
public interface RoomsService {

    List getRoomByHotelID(Integer hotel);
    List getRoomByNumber(Integer number);

}
