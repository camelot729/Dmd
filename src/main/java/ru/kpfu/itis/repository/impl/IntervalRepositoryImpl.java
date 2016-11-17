package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class IntervalRepositoryImpl {

    @PersistenceContext
    EntityManager em;

    public List getIntervalsByStaffId(Integer id) {
        Query query = em.createNativeQuery("select i.day_of_week, i.period from interval i, staff_interval sti where i.id = sti.interval_id and sti.staff_id = ?");
        query.setParameter(1, id);
        return query.getResultList();
    }

    public List getIntervalsByStaffAndDayOfWeek(Integer id, String day) {
        Query query = em.createNativeQuery("select i.period from interval i, staff_interval sti where i.id = sti.interval_id and sti.staff_id = ? and i.day_of_week = ? AND i.status = 'EMPTY'");
        query.setParameter(1, id);
        query.setParameter(2, day);
        return query.getResultList();
    }

    public Integer getIntervalIdByStaffDayTime(Integer id, String day, String time){

        Query query = em.createNativeQuery("select i.id from interval i, staff_interval sti where i.id = sti.interval_id and sti.staff_id = ? and i.day_of_week = ? AND i.period = ?");
        query.setParameter(1, id);
        query.setParameter(2, day);
        query.setParameter(3, time);

        if (query.getResultList().size() == 0) {
            return 0;
        }
        return (Integer)query.getResultList().get(0);
    }

    public void changeInterval(Integer clientId, Integer intervalId){
        Query query = em.createNativeQuery("UPDATE interval SET client_id = ?, status = 'BUSY' WHERE id = ?");
        query.setParameter(1, clientId);
        query.setParameter(2, intervalId);
        query.executeUpdate();
    }

    public List getAllBusyIntervals(){
        Query query = em.createNativeQuery("select i.id from interval i WHERE i.status = 'BUSY'");
        return query.getResultList();
    }

}
