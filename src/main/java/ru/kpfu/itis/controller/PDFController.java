package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.service.IntervalService;
import ru.kpfu.itis.service.MedClinicService;

import java.math.BigInteger;

@Controller
public class PDFController {

    @Autowired
    MedClinicService clinicService;


    @Autowired
    IntervalService intervalService;

    @RequestMapping(value = "/generate/pdf.htm", method = RequestMethod.GET)
    ModelAndView generatePdf() throws Exception {

        BigInteger salary = clinicService.getAllSalary();
        BigInteger rent = clinicService.getAllRent();
        BigInteger sum = rent.add(salary);


        ModelAndView modelAndView = new ModelAndView("pdfView", "salary", salary);
        modelAndView.addObject("rent", rent);
        modelAndView.addObject("sum", sum);

        return modelAndView;
    }
}
