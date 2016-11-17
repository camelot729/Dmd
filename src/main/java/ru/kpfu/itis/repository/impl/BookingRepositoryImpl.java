package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.BookingEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */

@Repository
public class BookingRepositoryImpl {

    @PersistenceContext
    EntityManager em;

    public List findAll() {
        Query query = em.createNativeQuery("SELECT * FROM CLIENT_BOOKING");
        return query.getResultList();
    }

    public List findAllHotelsByUserId(Integer id) {
        Query query = em.createNativeQuery("SELECT h.name  FROM booking as C , hotel as h WHERE user_id = ? AND c.hotel_id=h.id");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public List<BookingEntity> findAllUserssByHotelId(Integer id) {
        Query query = em.createNativeQuery("SELECT DISTINCT CL.arrived FROM booking as CL, clients AS c, rooms as r, staff as s WHERE CL.hotel_id = ? AND c.id = CL.user_id AND CL.room_id = r.id ");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public List<BookingEntity> findAllUserssByHotelId2(Integer id) {
        Query query = em.createNativeQuery("SELECT DISTINCT CL.departe FROM booking as CL, clients AS c, rooms as r, staff as s WHERE CL.hotel_id = ? AND c.id = CL.user_id AND CL.room_id = r.id ");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public List<BookingEntity> findAllUserssByHotelId3(Integer id) {
        Query query = em.createNativeQuery("SELECT DISTINCT r.number FROM booking as CL, clients AS c, rooms as r, staff as s WHERE CL.hotel_id = ? AND c.id = CL.user_id AND CL.room_id = r.id ");
        query.setParameter(1, id);
        return query.getResultList();
    }


    public List<BookingEntity> findAllHotelIdByUserId(Integer id){
        Query query = em.createNativeQuery("SELECT h.id  FROM booking as C , hotel as h WHERE user_id = ? AND c.hotel_id=h.id");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public List<BookingEntity> takeNameHotelByHotelId(Integer id){
        Query query = em.createNativeQuery("SELECT h.name FROM hotel as h WHERE h.id = (SELECT c.hotel_id FROM booking as c WHERE c.user_id = ?)");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public Integer takeRoomNumberByRoomIdAndHotelId(Integer id, Integer hotel){
        Query query = em.createNativeQuery("SELECT r.number FROM booking as b, rooms as r WHERE b.hotel_id=r.idHotel AND b.hotel_id=? AND r.id = b.room_id And b.room_id=?");
        query.setParameter(1, id);
        query.setParameter(2,hotel);
        return Integer.parseInt((String) query.getResultList().get(0));
    }

    public List takeBookingId(Integer user){
        Query query = em.createNativeQuery("SELECT * FROM booking WHERE user_id=?");
        query.setParameter(1,user);
        return query.getResultList();
    }
    @Transactional
    public void save(BookingEntity bookingEntity) {
        Query query = em.createNativeQuery("INSERT INTO booking (arrived, departe, hotel_id, room_id, user_id) VALUES (?,?,?,?,?)");
        query.setParameter(3, bookingEntity.getHotel());
        query.setParameter(5, bookingEntity.getUser());
        query.setParameter(4, bookingEntity.getRoom());
        query.setParameter(1, bookingEntity.getArrived());
        query.setParameter(2, bookingEntity.getDeparte());
        query.executeUpdate();
    }

}
