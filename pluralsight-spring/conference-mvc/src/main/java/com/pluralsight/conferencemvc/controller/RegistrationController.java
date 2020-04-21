package com.pluralsight.conferencemvc.controller;

import com.pluralsight.conferencemvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration"; // .jsp file
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Registration registration) {
        System.out.println(registration.getName());
        return "registration"; // .jsp file
    }
}
