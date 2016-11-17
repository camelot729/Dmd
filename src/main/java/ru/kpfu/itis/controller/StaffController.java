package ru.kpfu.itis.controller;

import org.bouncycastle.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.*;
import ru.kpfu.itis.service.*;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

    @Autowired
    StaffProfileService profileService;

    @Autowired
    IntervalService intervalService;

    @Autowired
    ManagerProfileService managerProfileService;

    @Autowired
    BookingService bookingService;

    @Autowired
    HotelService hotelService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProfilePage(Model model){

        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = person.getFirstname() + " " + person.getSurname();
        String role = String.valueOf(person.getRole());

        if (role.equals("ROLE_ADMIN")){
            return "redirect:/admin";
        }

        if (role.equals("ROLE_CLIENT")) {
            return "redirect:/client";
        }

        model.addAttribute("username", name);

        StaffEntity staffEntity = staffService.getStaffEntityById(person.getId());
        StaffProfileEntity profile = profileService.getStaffProfileEntityByStaffEntity(staffEntity);

        model.addAttribute("staff", staffEntity);
        model.addAttribute("profile", profile);
        
        return "staff_profile_page";
    }

    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public String getSchedule(Model model){

        PersonEntity personEntity = (PersonEntity)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List list = intervalService.getIntervalsByStaffId(personEntity.getId());
        model.addAttribute("schedule", list);
        return "staff_schedule";
    }


    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String getBooking(Model model){
        PersonEntity personEntity = (PersonEntity)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer personId = personEntity.getId();


        StaffEntity staffEntity = staffService.getStaffEntityById(personId);

        Integer hotelID = managerProfileService.getHotelIdByStaffId(staffEntity.getId());
        List<BookingEntity> booking = bookingService.getBookingByHotelId(hotelID);

        model.addAttribute("id", staffEntity.getFirstname());
        model.addAttribute("hotel", hotelID);
        model.addAttribute("booking",booking);

        return "manager_profile_page";

    }


}
