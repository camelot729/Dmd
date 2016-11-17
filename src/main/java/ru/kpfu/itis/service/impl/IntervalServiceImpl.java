package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.Interval;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.entity.StaffProfileInterval;
import ru.kpfu.itis.entity.enums.Period;
import ru.kpfu.itis.entity.enums.Status;
import ru.kpfu.itis.repository.IntervalRepository;
import ru.kpfu.itis.repository.StaffIntervalRepository;
import ru.kpfu.itis.repository.impl.IntervalRepositoryImpl;
import ru.kpfu.itis.service.IntervalService;
import ru.kpfu.itis.service.StaffProfileService;
import ru.kpfu.itis.service.StaffService;

import java.time.DayOfWeek;
import java.util.List;

@Service
public class IntervalServiceImpl implements IntervalService {

    @Autowired
    IntervalRepositoryImpl intervalRepositoryImpl;

    @Autowired
    IntervalRepository intervalRepository;

    @Autowired
    StaffService staffService;

    @Autowired
    StaffProfileService profileService;

    @Autowired
    StaffIntervalRepository staffIntervalRepository;

    @Override
    public List getIntervalsByStaffId(Integer id) {
        StaffProfileEntity profileEntity = profileService.getStaffProfileEntityByStaffEntity(staffService.getStaffEntityById(id));
        return intervalRepositoryImpl.getIntervalsByStaffId(profileEntity.getId());
    }

    @Override
    public List<String> getIntervalsByStaffAndDayOfWeek(Integer id, String day) {
        return intervalRepositoryImpl.getIntervalsByStaffAndDayOfWeek(id,day);
    }

    @Override
    public List findAll() {
        return intervalRepositoryImpl.getAllBusyIntervals();
    }

    @Override
    public void saveNewInterval(String day, String period, Integer staffId) {
        Interval interval = new Interval();
        interval.setDayOfWeek(DayOfWeek.valueOf(day));
        interval.setPeriod(Period.valueOf(period));
        interval.setStatus(Status.EMPTY);
        intervalRepository.save(interval);

        StaffProfileInterval staffProfileInterval = new StaffProfileInterval();
        StaffEntity staffEntity = staffService.getStaffEntityById(staffId);
        StaffProfileEntity profileEntity = profileService.getStaffProfileEntityByStaffEntity(staffEntity);
        staffProfileInterval.setInstructorProfile(profileEntity);
        staffProfileInterval.setInterval(interval);
        staffIntervalRepository.save(staffProfileInterval);
    }
}
