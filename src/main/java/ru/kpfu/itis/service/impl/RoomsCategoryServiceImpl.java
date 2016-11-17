package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.impl.RoomCategoryRepositoryImpl;
import ru.kpfu.itis.service.RoomCategoryService;

/**
 * Created by Kamil on 17.11.16.
 */
@Service
public class RoomsCategoryServiceImpl implements RoomCategoryService {

    @Autowired
    RoomCategoryRepositoryImpl roomCategoryRepository;

    @Override
    public Integer getRoomCategoryByRoomId(Integer room) {
        return roomCategoryRepository.findRoomCategoryByRoomId(room);
    }

    @Override
    public Integer getRoomCategoryByCapacity(Integer capaciry) {
        return roomCategoryRepository.findRoomCategoryByCapacity(capaciry);
    }

    @Override
    public Integer getRoomCategoryCapacityByRoomId(Integer id) {
        return roomCategoryRepository.findRoomCategoryCapasityByRoomId(id);
    }
}
