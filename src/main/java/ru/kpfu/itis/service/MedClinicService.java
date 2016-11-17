package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.MedClinicEntity;
import ru.kpfu.itis.entity.OfficeEntity;

import java.math.BigInteger;
import java.util.List;

public interface MedClinicService {

    List<OfficeEntity> getAllOffice();

    BigInteger getAllSalary();

    BigInteger getAllRent();

    MedClinicEntity getOneById(Integer id);

}
