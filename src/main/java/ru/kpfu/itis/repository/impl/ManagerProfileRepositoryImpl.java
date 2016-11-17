package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.ManagerProfileEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Kamil on 17.11.16.
 */

@Repository
public class ManagerProfileRepositoryImpl {

    @PersistenceContext
    EntityManager em;

    public List findAll() {
        Query query = em.createNativeQuery("SELECT * FROM manager_profile");
        return query.getResultList();
    }

    public List findStaffIdByHotelId(Integer id){
        Query query = em.createNativeQuery("SELECT staff_id FROM manager_profile WHERE hotel_id = ?");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public Integer findHotelIdByStaffId(Integer id){
        Query query = em.createNativeQuery("SELECT hotel_id FROM manager_profile WHERE staff_id = ?");
        query.setParameter(1, id);
        return Integer.parseInt((String) query.getResultList().get(0));
    }

    @Transactional
    public void save(ManagerProfileEntity managerProfileEntity) {
        Query query = em.createNativeQuery("INSERT INTO manager_profile (hotel_id, staff_id) VALUES (?,?)");
        query.setParameter(1, managerProfileEntity.getHotel());
        query.setParameter(2, managerProfileEntity.getStaff());
        query.executeUpdate();

    }
}
