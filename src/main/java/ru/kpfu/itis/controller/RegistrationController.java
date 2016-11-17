package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.service.ClientService;
import ru.kpfu.itis.service.StaffService;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    ClientService clientService;

    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String getClientRegistrationPage(Model model) {
        model.addAttribute("userform", new RegistrationForm());
        return "registration_client";
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String getClientRegistration(@ModelAttribute("userform") @Valid RegistrationForm form, BindingResult result) {

        if (clientService.getClientEntityByLogin(form.getLogin()) != null ||
                staffService.getStaffEntityByLogin(form.getLogin()) != null) {
            result.addError(new FieldError("userform", "login", "Логин уже используется"));
        }

        if (result.hasErrors()) {
            return "registration_client";
        }

        clientService.saveNewClient(form);
        return "redirect:/login";
    }

}
