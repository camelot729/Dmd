package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.PersonEntity;

@Controller
public class IndexPageController {


    @RequestMapping("/")
    public String getIndexPage(){
        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() != "anonymousUser") {

            PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String role = String.valueOf(person.getRole());

            if (role.equals("ROLE_ADMIN")) {
                return "redirect:/admin/staff";
            }

            if (role.equals("ROLE_CLIENT")) {
                return "redirect:/client";
            }

            if (role.equals("ROLE_STAFF")) {
                return "redirect:/staff";
            }
        }

        return "index_page";
    }


}
