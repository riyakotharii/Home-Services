package com.homeservices.home_services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {

    @GetMapping("/home")
    public String homePage() {
        return "index";
    }
}

