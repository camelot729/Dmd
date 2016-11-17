package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.form.ProfileForm;
import ru.kpfu.itis.repository.StaffProfileRepository;
import ru.kpfu.itis.repository.impl.StaffProfileRepositoryImpl;
import ru.kpfu.itis.service.OfficeService;
import ru.kpfu.itis.service.StaffProfileService;
import ru.kpfu.itis.util.ProfileStaffEditForm;
import ru.kpfu.itis.util.StaffRegFormToUserTransformer;

import java.util.List;

@Service
public class StaffProfileServiceImpl implements StaffProfileService {

    @Autowired
    StaffProfileRepository profileRepository;

    @Autowired
    StaffProfileRepositoryImpl staffProfileRepository;

    @Autowired
    OfficeService officeService;

    @Override
    public StaffProfileEntity getStaffProfileEntityById(Integer id) {
        return profileRepository.findOneById(id);
    }

    @Override
    public StaffProfileEntity getStaffProfileEntityByStaffEntity(StaffEntity staffEntity) {
        return profileRepository.findByStaffEntity(staffEntity);
    }


    @Override
    public void saveNewProfile(ProfileForm profileForm, StaffProfileEntity staffProfileEntity, StaffEntity staffEntity) {
        OfficeEntity officeEntity = officeService.getOfficeById(1);
        StaffProfileEntity profileEntity = ProfileStaffEditForm.transform(profileForm, staffProfileEntity, staffEntity, officeEntity);
        profileRepository.save(profileEntity);
    }

    @Override
    public List<String> getAllDoctorsNamesByPosition(String position) {
        return staffProfileRepository.getAllDoctorsNamesByPosition(position);
    }

}
