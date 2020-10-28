package com.alfaservice.webcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebContentApplication extends SpringBootServletInitializer {

    public WebContentApplication(){
        super();
        setRegisterErrorPageFilter(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebContentApplication.class, args);
    }
}
