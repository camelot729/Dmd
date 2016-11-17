package ru.kpfu.itis.controller;

import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.*;
import ru.kpfu.itis.form.BookingForm;
import ru.kpfu.itis.service.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    StaffService staffService;

    @Autowired
    HotelService hotelService;

    @Autowired
    BookingService bookingService;

    @Autowired
    RoomsService roomsService;

    @Autowired
    RoomCategoryService roomCategoryService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProfilePage(Model model){
        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String role = String.valueOf(person.getRole());

        ClientEntity client = clientService.getClientEntityById(person.getId());
        model.addAttribute("client", client);
        return "profile";
    }

    @RequestMapping(value = {"/hotel","/hotel/{pageNumber}"}, method = RequestMethod.GET)
    public String getHotel(@PathVariable Map<String, String> pathVariables, Model model){


        int pageNumber = 0;
        if (pathVariables.containsKey("pageNumber")) pageNumber = Integer.parseInt(pathVariables.get("pageNumber"));

        Page<HotelEntity> hotelEntities = hotelService.getAllHotel(new PageRequest(pageNumber, 20));

        model.addAttribute("hotel", hotelEntities);
        model.addAttribute("page", pageNumber);

        Integer maxPage = hotelEntities.getTotalPages();

        model.addAttribute("maxpage", maxPage);

        return "hotel_view";
    }

    @RequestMapping(value = "/hotel/profile/{id}", method = RequestMethod.GET)
    public String getHotelProfilePage(@PathVariable Integer id, Model model) {

        HotelEntity hotelEntity = hotelService.getHotelById(id);
        model.addAttribute("hotel", hotelEntity);
        return "hotel_profile_page";
    }

    @RequestMapping(value = "/myBooking", method = RequestMethod.GET)
    public String getClientBooking(Model model){

        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer personId = person.getId();
        List<BookingEntity> bookingEntity = bookingService.getBookingByUserId(personId);
        List<BookingEntity> bookingEntities = bookingService.getHotelIdByUserId(personId);
        List<Pair<BookingEntity, BookingEntity>> list = new ArrayList<>();
        for (int i = 0; i < bookingEntities.size(); i++)
            list.add(new Pair<>(bookingEntity.get(i), bookingEntities.get(i)));

        model.addAttribute("booking",bookingEntity);
        model.addAttribute("id", bookingEntities);
        model.addAttribute("list", list);

        return "client_booking";
    }

    @RequestMapping(value = "/myBooking/{id}", method = RequestMethod.GET)
    public String getBookingInfo(@PathVariable Integer id, Model model){

        HotelEntity hotelEntity = hotelService.getHotelById(id);

        model.addAttribute("hotel", hotelEntity);

        List<RoomsEntity> roomsEntity = roomsService.getRoomByHotelID(id);

        model.addAttribute("rooms", roomsEntity);

        return "booking_info";
    }

    @RequestMapping(value = "/hotel/profile/{id}/booking", method = RequestMethod.GET)
    public String getBookingPage(@PathVariable Integer id, Model model){

        List<RoomsEntity> roomsEntity = roomsService.getRoomByHotelID(id);


        model.addAttribute("bookingform", new BookingForm());
        model.addAttribute("rooms", roomsEntity);

        HotelEntity hotelEntity = hotelService.getHotelById(id);
        model.addAttribute("hotel", hotelEntity);
        return "hotel_booking_page";
    }

    @RequestMapping(value = "/hotel/profile/{id}/booking", method = RequestMethod.POST)
    public String getBookingPage(@PathVariable Integer id, @ModelAttribute("bookingform") @Valid BookingForm form,
                                 BindingResult result, Model model){


        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();



        HotelEntity hotelEntity = hotelService.getHotelById(id);

        List<RoomsEntity> roomsEntity = roomsService.getRoomByHotelID(id);

        model.addAttribute("rooms", roomsEntity);
        model.addAttribute("hotel", hotelEntity);
        Integer name = person.getId();
        form.setHotel(id);
        form.setUser(name);
        bookingService.safeNewBooking(form);

        return "redirect:/client/myBooking";
    }


}
