package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.entity.enums.Period;
import ru.kpfu.itis.service.IntervalService;
import ru.kpfu.itis.service.StaffProfileService;
import ru.kpfu.itis.service.StaffService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    StaffService staffService;

    @Autowired
    StaffProfileService profileService;

    @Autowired
    IntervalService intervalService;

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List getDoctorsByPosition(@ModelAttribute("doctor") @RequestParam(value = "doctor") String doctor){
        System.out.println(doctor);
        List profiles = profileService.getAllDoctorsNamesByPosition(doctor);
        return profiles;
    }

    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List getDoctorsScheduleById(@RequestParam(value = "doctor") Integer id, @RequestParam(value = "day") String day){
        StaffProfileEntity profileEntity = profileService.getStaffProfileEntityByStaffEntity(staffService.getStaffEntityById(id));
        List times = intervalService.getIntervalsByStaffAndDayOfWeek(profileEntity.getId(),day);
        List list = new ArrayList<>();

        for (Object time: times){
            list.add(Period.valueOf((String)time).getRepresentation());
        }
        return list;
    }


}
