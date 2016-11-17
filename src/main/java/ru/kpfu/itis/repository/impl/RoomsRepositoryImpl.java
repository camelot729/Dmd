package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.RoomsEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */
@Repository
public class RoomsRepositoryImpl {
    @PersistenceContext
    EntityManager em;

    public List findAll(){
        Query query = em.createNativeQuery("SELECT * FROM rooms");
        return query.getResultList();
    }

    public List findRoomsByHotelId(Integer hotel){
        Query query = em.createNativeQuery("SELECT number FROM rooms WHERE idHotel = ?");
        query.setParameter(1, hotel);
        return query.getResultList();
    }

    public List findRoomsByNumber(Integer number){
        Query query = em.createNativeQuery("SELECT * FROM rooms WHERE number = ?");
        query.setParameter(1, number);
        return query.getResultList();
    }

    @Transactional
    public void save(RoomsEntity roomsEntity){
        Query query = em.createNativeQuery("INSERT INTO rooms (number, idHotel) VALUES (?,?)");
        query.setParameter(1, roomsEntity.getNumber());
        query.setParameter(2, roomsEntity.getHotel());
        query.executeUpdate();
    }
}
