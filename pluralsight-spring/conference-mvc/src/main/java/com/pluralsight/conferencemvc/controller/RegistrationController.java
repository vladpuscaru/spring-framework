package com.pluralsight.conferencemvc.controller;

import com.pluralsight.conferencemvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration"; // .jsp file
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")
                                              Registration registration, BindingResult result) {

        if (result.hasErrors()) {
            return "registration";
        }

        return "redirect:registration"; // .jsp file
    }
}
