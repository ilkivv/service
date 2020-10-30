package com.alfaservice.webcontent.controllers;

import com.alfaservice.webcontent.entities.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.Map;

@Controller
public class SettingController {

    @PostMapping(path = "/settings")
    public String addNewSetting(@RequestAttribute Map<Setting, Long> model){
        return "settings";
    }

    @GetMapping(path = "/settings")
    public String showSettings(){
        return "pages/settings";
    }
}
