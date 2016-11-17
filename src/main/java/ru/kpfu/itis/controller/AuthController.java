package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Controller
@RequestMapping("/login")
public class AuthController {

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin(HttpServletResponse response,
                           @RequestParam(value = "error", required = false) String error,
                           Model model) {
        if (Objects.equals(error, "true")) {
            model.addAttribute("error", error);
        }

        return "login_page";
    }

}
