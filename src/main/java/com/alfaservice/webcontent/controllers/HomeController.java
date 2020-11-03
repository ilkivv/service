package com.alfaservice.webcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends IndexController{

    public static final String INDEX_TEMPLATE_PAGE = "pages/index";

    @GetMapping
    public String homePage(){
        return INDEX_TEMPLATE_PAGE;
    }

}
