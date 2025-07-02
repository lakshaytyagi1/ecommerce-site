package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //this will handle the request
public class HomeController {
    @RequestMapping("/") // it will mapp the reuest with the server
    public String greet(){
        return "Welcome to the home page";
    }
    @RequestMapping("/about")
    public  String about(){
        return "This is the about page:";
    }
}
