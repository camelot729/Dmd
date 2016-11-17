package ru.kpfu.itis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.RegistrationForm;

public interface StaffService {

    Page<StaffEntity> getAllStaff(PageRequest pageRequest);

    StaffEntity getStaffEntityById(Integer id);

    StaffEntity getStaffEntityByLogin(String login);

    void saveNewStaff(RegistrationForm form);

}
