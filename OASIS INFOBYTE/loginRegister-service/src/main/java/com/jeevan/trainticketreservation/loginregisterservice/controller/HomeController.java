package com.jeevan.trainticketreservation.loginregisterservice.controller;

import com.jeevan.trainticketreservation.loginregisterservice.Entity.Users;
import com.jeevan.trainticketreservation.loginregisterservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<Users> getUser(){
        System.out.println("Getting users.");
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){

        return principal.getName();
    }


}
