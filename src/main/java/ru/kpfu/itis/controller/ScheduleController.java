package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.repository.impl.IntervalRepositoryImpl;
import ru.kpfu.itis.service.IntervalService;

@Controller
public class ScheduleController {

    @Autowired
    IntervalService intervalService;

    @Autowired
    IntervalRepositoryImpl intervalRepository;

    @RequestMapping(value = "/schedule/edit", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public
    @ResponseBody
    void setSchedule(@RequestParam(value = "staffId") String id,
                     @RequestParam(value = "day") String day,
                     @RequestParam(value = "time") String time) {
        Integer intervalId = intervalRepository.getIntervalIdByStaffDayTime(Integer.parseInt(id),day, time);

        if (intervalId == 0) {
            intervalService.saveNewInterval(day, time, Integer.parseInt(id));
        }
    }

}
