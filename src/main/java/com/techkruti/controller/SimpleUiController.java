package com.techkruti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleUiController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/doctor")
    public String doctor() {
        return "doctor";
    }

    @GetMapping("/appointment")
    public String appointment() {
        return "appointment";
    }

}
