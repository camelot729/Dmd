package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.repository.IntervalRepository;
import ru.kpfu.itis.repository.StaffRepository;
import ru.kpfu.itis.service.StaffService;
import ru.kpfu.itis.util.StaffRegFormToUserTransformer;

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    StaffRepository staffRepository;

    @Autowired
    IntervalRepository intervalRepository;

    @Override
    public Page<StaffEntity> getAllStaff(PageRequest request) {
        return staffRepository.findAll(request);
    }

    @Override
    public StaffEntity getStaffEntityById(Integer id) {
        return staffRepository.findOneById(id);
    }

    @Override
    public StaffEntity getStaffEntityByLogin(String login) {
        return staffRepository.findOneByLogin(login);
    }

    @Override
    @Transactional
    public void saveNewStaff(RegistrationForm form) {
        StaffEntity staffEntity = StaffRegFormToUserTransformer.transform(form);
        staffRepository.save(staffEntity);
    }


}
