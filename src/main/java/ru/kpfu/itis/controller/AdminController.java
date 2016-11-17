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
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.form.OfficeForm;
import ru.kpfu.itis.form.ProfileForm;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.service.*;
import ru.kpfu.itis.util.StaffProfileFormValidator;

import javax.validation.Valid;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    StaffProfileFormValidator validator = new StaffProfileFormValidator();

    @Autowired
    MedClinicService clinicService;

    @Autowired
    OfficeService officeService;

    @Autowired
    StaffService staffService;

    @Autowired
    StaffProfileService profileService;

    @Autowired
    ClientService clientService;

    @Autowired
    IntervalService intervalService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAdminPage(Model model) {
        List list = intervalService.findAll();

        model.addAttribute("profit", list.size() * 500);
        return "admin_page";
    }

    @RequestMapping(value = {"/offices","/offices/{pageNumber}"}, method = RequestMethod.GET)
    public String getOfficesPage(@PathVariable Map<String, String> pathVariables, Model model) {

        int pageNumber = 0;
        if (pathVariables.containsKey("pageNumber")) pageNumber = Integer.parseInt(pathVariables.get("pageNumber"));

        Page<OfficeEntity> officeEntities = officeService.getAllOffices(new PageRequest(pageNumber, 3));
        model.addAttribute("offices", officeEntities);
        model.addAttribute("page", pageNumber);

        Integer maxPage = officeEntities.getTotalPages();

        model.addAttribute("maxpage", maxPage);

        return "admin_offices_page";
    }

    @RequestMapping(value = "/office/profile/{id}", method = RequestMethod.GET)
    public String getOfficeProfilePage(@PathVariable Integer id, Model model) {

        OfficeEntity officeEntity = officeService.getOfficeById(id);

        model.addAttribute("office", officeEntity);

        return "admin_office_profile_page";
    }

    @RequestMapping(value = {"/staff","/staff/{pageNumber}"}, method = RequestMethod.GET)
    public String getStaffPage(@PathVariable Map<String, String> pathVariables, Model model) {

        int pageNumber = 0;
        if (pathVariables.containsKey("pageNumber")) pageNumber = Integer.parseInt(pathVariables.get("pageNumber"));

        Page<StaffEntity> staffEntities = staffService.getAllStaff(new PageRequest(pageNumber, 10));
        Integer maxPage = staffEntities.getTotalPages();
        model.addAttribute("staff", staffEntities);
        model.addAttribute("page", pageNumber);
        model.addAttribute("maxpage", maxPage);

        return "admin_staff_page";
    }

    @RequestMapping(value = "/expenses", method = RequestMethod.GET)
    public String getExpensesPage(Model model) {
        BigInteger salary = clinicService.getAllSalary();
        BigInteger rent = clinicService.getAllRent();

        List list = intervalService.findAll();

        model.addAttribute("profit", list.size() * 500);

        model.addAttribute("salary1", salary);
        model.addAttribute("salary2", salary + "");

        model.addAttribute("rent1", rent);
        model.addAttribute("rent2", rent + "");
        model.addAttribute("expenses", salary.add(rent) + "");
        return "admin_expenses_page";
    }

    @RequestMapping(value = "/staff/profile/{id}", method = RequestMethod.GET)
    public String getStaffProfilePage(@PathVariable Integer id, Model model) {

        StaffEntity staffEntity = staffService.getStaffEntityById(id);
        StaffProfileEntity profile = profileService.getStaffProfileEntityByStaffEntity(staffEntity);

        if (profile == null) profile = new StaffProfileEntity();

        model.addAttribute("staff", staffEntity);
        model.addAttribute("profile", profile);

        return "admin_staff_profile_page";
    }

    @RequestMapping(value = "/staff/edit/profile/{id}", method = RequestMethod.GET)
    public String updateStaffProfile(@PathVariable Integer id, Model model) {

        StaffEntity staffEntity = staffService.getStaffEntityById(id);
        StaffProfileEntity profile = profileService.getStaffProfileEntityByStaffEntity(staffEntity);

        if (profile == null) profile = new StaffProfileEntity();

        model.addAttribute("staff", staffEntity);
        model.addAttribute("profile", profile);
        model.addAttribute("id", id);
        model.addAttribute("salary", profile.getSalary() + "");

        model.addAttribute("userform", new ProfileForm());

        return "admin_staff_profile_edit_page";
    }

    @RequestMapping(value = "/staff/edit/profile/{id}", method = RequestMethod.POST)
    public String updateStaffProfile(Model model, @PathVariable Integer id, @ModelAttribute("profileForm") @Valid ProfileForm form, BindingResult result) {

        validator.validate(form, result);

        if (result.hasErrors()){
            StaffEntity staffEntity = staffService.getStaffEntityById(id);
            StaffProfileEntity profile = profileService.getStaffProfileEntityByStaffEntity(staffEntity);

            model.addAttribute("staff", staffEntity);
            model.addAttribute("profile", profile);
            model.addAttribute("id", id);
            model.addAttribute("salary", profile.getSalary() + "");

            model.addAttribute("userform", new ProfileForm());

            return "admin_staff_profile_edit_page";
        } else {

            StaffEntity staffEntity = staffService.getStaffEntityById(id);
            StaffProfileEntity profile = profileService.getStaffProfileEntityByStaffEntity(staffEntity);

            profileService.saveNewProfile(form, profile, staffEntity);

            String str = "/admin/staff/profile/" + id;

            return "redirect:" + str;
        }
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
        model.addAttribute("officeform", new OfficeForm());
        return "admin_registration_office";
    }

    @RequestMapping(value = "/registration/office", method = RequestMethod.POST)
    public String getOfficeRegistrationPage(@ModelAttribute("officeform") @Valid OfficeForm form, BindingResult result) {

        if (result.hasErrors()) {
            return "admin_registration_office";
        }

        officeService.saveNewOffice(form);
        return "redirect:/admin/offices";
    }

    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.GET)
    public String getSchedule(@PathVariable("id") Integer id,Model model){

        List list = intervalService.getIntervalsByStaffId(id);
        model.addAttribute("size", list.size());
        model.addAttribute("schedule", list);

        return "admin_staff_schedule";
    }

    @RequestMapping(value = "/edit/schedule/{id}", method = RequestMethod.GET)
    public String setSchedule(@PathVariable("id") Integer id,Model model){

        StaffEntity staffEntity = staffService.getStaffEntityById(id);

        if (profileService.getStaffProfileEntityByStaffEntity(staffEntity) == null){
            return "redirect:/admin/staff/profile/" + id;
        }

        model.addAttribute("staffId", id);

        List list = intervalService.getIntervalsByStaffId(id);
        model.addAttribute("size", list.size());
        model.addAttribute("schedule", list);

        return "admin_staff_schedule_edit";
    }


}
