package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.HotelEntity;
import ru.kpfu.itis.entity.ManagerProfileEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.HotelForm;
import ru.kpfu.itis.form.ProfileForm;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.service.*;
import ru.kpfu.itis.util.StaffProfileFormValidator;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    StaffProfileFormValidator validator = new StaffProfileFormValidator();

    @Autowired
    StaffService staffService;

    @Autowired
    ClientService clientService;

    @Autowired
    HotelService hotelService;

    @Autowired
    ManagerProfileService managerProfileService;

    @RequestMapping(value = {"/offices","/offices/{pageNumber}"}, method = RequestMethod.GET)
    public String getOfficesPage(@PathVariable Map<String, String> pathVariables, Model model) {

        int pageNumber = 0;
        if (pathVariables.containsKey("pageNumber")) pageNumber = Integer.parseInt(pathVariables.get("pageNumber"));

        Page<HotelEntity> hotelEntities = hotelService.getAllHotel(new PageRequest(pageNumber, 5));
        model.addAttribute("offices", hotelEntities);
        model.addAttribute("page", pageNumber);
        Integer maxPage = hotelEntities.getTotalPages();
        model.addAttribute("maxpage", maxPage);
        return "admin_offices_page";
    }

    @RequestMapping(value = "/office/profile/{id}", method = RequestMethod.GET)
    public String getOfficeProfilePage(@PathVariable Integer id, Model model) {

        HotelEntity officeEntity = hotelService.getHotelById(id);

        model.addAttribute("office", officeEntity);

        return "admin_office_profile_page";
    }

    @RequestMapping(value = {"/staff","/staff/{pageNumber}"}, method = RequestMethod.GET)
    public String getStaffPage(@PathVariable Map<String, String> pathVariables, Model model) {

        int pageNumber = 0;
        if (pathVariables.containsKey("pageNumber")) pageNumber = Integer.parseInt(pathVariables.get("pageNumber"));

        Page<StaffEntity> staffEntities = staffService.getAllStaff(new PageRequest(pageNumber, 25));
        Integer maxPage = staffEntities.getTotalPages();
        model.addAttribute("staff", staffEntities);
        model.addAttribute("page", pageNumber);
        model.addAttribute("maxpage", maxPage);

        return "admin_staff_page";
    }

    @RequestMapping(value = "/staff/profile/{id}", method = RequestMethod.GET)
    public String getStaffProfilePage(@PathVariable Integer id, Model model) {

        StaffEntity staffEntity = staffService.getStaffEntityById(id);

        model.addAttribute("staff", staffEntity);

        return "admin_staff_profile_page";
    }

    @RequestMapping(value = "/registration/staff", method = RequestMethod.GET)
    public String getStaffRegistrationPage(Model model) {
        model.addAttribute("userform", new RegistrationForm());
        return "admin_registration_staff";
    }

    @RequestMapping(value = "/registration/staff", method = RequestMethod.POST)
    public String getStaffRegistrationPage(@ModelAttribute("userform") @Valid RegistrationForm form, BindingResult result) {

        if (clientService.getClientEntityByLogin(form.getLogin()) != null ||
                staffService.getStaffEntityByLogin(form.getLogin()) != null) {
            result.addError(new FieldError("userform", "login", "Логин уже используется"));
        }

        if (result.hasErrors()) {
            return "admin_registration_staff";
        }

        staffService.saveNewStaff(form);
        return "redirect:/admin/staff";
    }



    @RequestMapping(value = "/registration/office", method = RequestMethod.GET)
    public String getOfficeRegistrationPage(Model model) {
        model.addAttribute("officeform", new HotelForm());
        return "admin_registration_office";
    }

    @RequestMapping(value = "/registration/office", method = RequestMethod.POST)
    public String getOfficeRegistrationPage(@ModelAttribute("officeform") @Valid HotelForm form, BindingResult result) {

        if (result.hasErrors()) {
            return "admin_registration_office";
        }

        hotelService.safeNewHotel(form);
        return "redirect:/admin/offices";
    }




}
