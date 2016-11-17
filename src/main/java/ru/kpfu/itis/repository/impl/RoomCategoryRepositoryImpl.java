package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */
@Repository
public class RoomCategoryRepositoryImpl {
    @PersistenceContext
    EntityManager em;

    public List findAll() {
        Query query = em.createNativeQuery("SELECT * FROM room_category");
        return query.getResultList();
    }

    public Integer findRoomCategoryByRoomId(Integer room) {
        Query query = em.createNativeQuery("SELECT * FROM room_category WHERE id_room = ?");
        query.setParameter(1, room);
        return Integer.parseInt((String) query.getResultList().get(0));
    }

    public Integer findRoomCategoryByCapacity(Integer capacity) {
        Query query = em.createNativeQuery("SELECT * FROM room_category WHERE capacity = ?");
        query.setParameter(1, capacity);
        return Integer.parseInt((String) query.getResultList().get(0));
    }

    public Integer findRoomCategoryCapasityByRoomId(Integer id) {
        Query query = em.createNativeQuery("SELECT capacity FROM room_category WHERE id_room=?");
        query.setParameter(1, id);
        return Integer.parseInt((String) query.getResultList().get(0));
    }
}
