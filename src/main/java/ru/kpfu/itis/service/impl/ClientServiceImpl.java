package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.ClientEntity;
import ru.kpfu.itis.entity.PersonEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.entity.enums.Period;
import ru.kpfu.itis.form.ReceptionForm;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.repository.ClientRepository;
import ru.kpfu.itis.repository.StaffProfileRepository;
import ru.kpfu.itis.repository.impl.IntervalRepositoryImpl;
import ru.kpfu.itis.service.ClientService;
import ru.kpfu.itis.service.StaffProfileService;
import ru.kpfu.itis.service.StaffService;
import ru.kpfu.itis.util.ClientRegFormToUserTransformer;

import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    StaffProfileService profileService;

    @Autowired
    StaffService staffService;

    @Autowired
    IntervalRepositoryImpl intervalRepositoryImpl;

    @Override
    @Transactional
    public void saveNewClient(RegistrationForm form) {
        ClientEntity clientEntity = ClientRegFormToUserTransformer.transform(form);
        clientRepository.save(clientEntity);
    }

    @Override
    public ClientEntity getClientEntityById(Integer id) {
        return clientRepository.findOneById(id);
    }

    @Override
    public ClientEntity getClientEntityByLogin(String login) {
        return clientRepository.findOneByLogin(login);
    }

    @Override
    @Transactional
    public void changeInterval(ReceptionForm form) {
        StaffEntity staffEntity = staffService.getStaffEntityById(Integer.parseInt(form.getDoctor()));
        StaffProfileEntity profileEntity = profileService.getStaffProfileEntityByStaffEntity(staffEntity);

        String time = "";

        if (Objects.equals(form.getTime(), "9:00 - 10:00")){
            time = "AM9_AM10";
        } else {
            if (Objects.equals(form.getTime(), "10:00 - 11:00")){
                time = "AM10_AM11";
            } else {
                time = "AM11_PM12";
            }
        }

        Integer intervalId = intervalRepositoryImpl.getIntervalIdByStaffDayTime(profileEntity.getId(), form.getDay(), time);
        PersonEntity user = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        intervalRepositoryImpl.changeInterval(user.getId(), intervalId);
    }


}
