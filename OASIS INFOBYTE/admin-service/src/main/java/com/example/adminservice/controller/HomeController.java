package com.example.adminservice.controller;

import com.example.adminservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/admin")
public class HomeController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/current-admin")
    public String getLoggedInAdmin(Principal principal){
        return principal.getName();
    }
}
