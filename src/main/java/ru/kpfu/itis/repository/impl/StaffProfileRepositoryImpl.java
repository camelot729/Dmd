package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StaffProfileRepositoryImpl {

    @PersistenceContext
    EntityManager em;

    public List<String> getAllDoctorsNamesByPosition(String position) {
        Query query = em.createNativeQuery("select st.surname, st.firstname, st.id  from staff_profile stf, staff st where stf.staff_person = st.id and stf.position = ?");
        query.setParameter(1, position);
        return query.getResultList();
    }

}
