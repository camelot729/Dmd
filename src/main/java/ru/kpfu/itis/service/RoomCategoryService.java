package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.RoomCategoryEntity;

/**
 * Created by Kamil on 17.11.16.
 */
public interface RoomCategoryService  {

    Integer getRoomCategoryByRoomId(Integer room);
    Integer getRoomCategoryByCapacity(Integer capacity);
}
