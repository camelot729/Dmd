package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.RoomCategoryEntity;
import ru.kpfu.itis.repository.HotelRepository;
import ru.kpfu.itis.repository.impl.RoomsRepositoryImpl;
import ru.kpfu.itis.service.RoomsService;

import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */
@Service
public class RoomsServiceImpl implements RoomsService {

    @Autowired
    RoomsRepositoryImpl roomsRepository;

    @Override
    public List getRoomByHotelID(Integer hotel) {
        return  roomsRepository.findRoomsByHotelId(hotel);
    }

    @Override
    public List getRoomByNumber(Integer number) {
        return roomsRepository.findRoomsByNumber(number);
    }
}
