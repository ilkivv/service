package com.alfaservice.webcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends IndexController{

    @GetMapping
    public String homePage(){
        return "pages/index";
    }

}
