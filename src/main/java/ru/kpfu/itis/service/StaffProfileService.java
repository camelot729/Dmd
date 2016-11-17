package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.form.ProfileForm;

import java.util.List;

public interface StaffProfileService {

    StaffProfileEntity getStaffProfileEntityById(Integer id);

    StaffProfileEntity getStaffProfileEntityByStaffEntity(StaffEntity staffEntity);

    void saveNewProfile(ProfileForm profileForm, StaffProfileEntity staffProfileEntity, StaffEntity staffEntity);

    List<String> getAllDoctorsNamesByPosition(String position);

}
