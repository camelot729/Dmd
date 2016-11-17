package ru.kpfu.itis.service;

import java.util.List;

public interface IntervalService {

    List getIntervalsByStaffId(Integer id);

    List<String> getIntervalsByStaffAndDayOfWeek(Integer id, String day);

    List findAll();

    void saveNewInterval(String day, String period, Integer staffId);

}
