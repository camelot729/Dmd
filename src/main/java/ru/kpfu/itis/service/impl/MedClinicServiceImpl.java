package ru.kpfu.itis.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.MedClinicEntity;
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.repository.ClinicRepository;
import ru.kpfu.itis.repository.OfficeRepository;
import ru.kpfu.itis.repository.StaffRepository;
import ru.kpfu.itis.repository.impl.MedClinicRepository;
import ru.kpfu.itis.service.MedClinicService;

import java.math.BigInteger;
import java.util.List;
import java.util.logging.Logger;

@Service
public class MedClinicServiceImpl implements MedClinicService {
    private static final Logger log = Logger.getLogger(MedClinicServiceImpl.class.getName());

    @Autowired
    MedClinicRepository medClinicRepository;

    @Autowired
    ClinicRepository clinicRepository;
//    @Autowired
//    PersonRepository personRepository;

    @Autowired
    OfficeRepository officeRepository;

    @Override
    public List<OfficeEntity> getAllOffice() {
        return officeRepository.findAll();
    }

    @Override
    public BigInteger getAllSalary() {
        return medClinicRepository.getAllSalary();
    }

    @Override
    public BigInteger getAllRent() {
        return medClinicRepository.getAllRent();
    }

    @Override
    public MedClinicEntity getOneById(Integer id) {
        return clinicRepository.findOneById(id);
    }


}
