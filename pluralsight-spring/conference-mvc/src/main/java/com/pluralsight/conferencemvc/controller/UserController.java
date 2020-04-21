package com.pluralsight.conferencemvc.controller;

import com.pluralsight.conferencemvc.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Vlad") String firstname,
                        @RequestParam(value = "lastName", defaultValue = "Puscaru") String lastName,
                        @RequestParam(value = "age", defaultValue = "23") int age) {
        User user = new User();

        user.setFirstName(firstname);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User addUser(User user) {
        return user;
    }
}
