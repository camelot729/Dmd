package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;

@Repository
public class MedClinicRepository implements ru.kpfu.itis.repository.MedClinicRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public BigInteger getAllSalary() {
        Query query = entityManager.createNativeQuery("SELECT SUM(salary) FROM staff_profile");
        return (BigInteger) query.getSingleResult();
    }

    @Override
    public BigInteger getAllRent() {
        Query query = entityManager.createNativeQuery("SELECT SUM(rent) FROM office");
        return (BigInteger) query.getSingleResult();
    }

}
