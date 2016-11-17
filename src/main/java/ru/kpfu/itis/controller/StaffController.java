package ru.kpfu.itis.controller;

import javafx.util.Pair;
import javafx.util.converter.IntegerStringConverter;
import org.bouncycastle.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.*;
import ru.kpfu.itis.service.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

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

        model.addAttribute("staff", staffEntity);

        return "staff_profile_page";
    }




    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String getBooking(Model model){
        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer personId = person.getId();

        Integer hotelId = managerProfileService.getHotelIdByStaffId(personId);
        List<BookingEntity> bookingEntities = bookingService.getBookingByHotelId(hotelId);
        List<BookingEntity> bookingEntities2 = bookingService.getBookingByHotelId2(hotelId);
        List<Pair<BookingEntity,BookingEntity>> list = new ArrayList<>();
        for (int i = 0; i < bookingEntities.size(); i++) {
            list.add(new Pair<>(bookingEntities.get(i), bookingEntities2.get(i)));
        }

        model.addAttribute("bookind", bookingEntities);
        model.addAttribute("bookind2", bookingEntities2);
        model.addAttribute("list", list);


        return "manager_profile_page";

    }


}
