package com.alfaservice.webcontent.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String logo_path;
    private String logo_full_path;

    private static final String LOGO_DEFAULT_PATH = "";
    private static final String LOGO_DEFAULT_FULL_PATH = "";

    public Brand(){}

    public Brand(String name){
        this.name = name;
        this.logo_path = LOGO_DEFAULT_PATH;
        this.logo_full_path = LOGO_DEFAULT_FULL_PATH;
    }

    public Brand(String name, String logo_path, String logo_full_path){
        this.name = name;
        this.logo_path = logo_path;
        this.logo_full_path = logo_full_path;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo_path() {
        return logo_path;
    }

    public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
    }

    public String getLogo_full_path() {
        return logo_full_path;
    }

    public void setLogo_full_path(String logo_full_path) {
        this.logo_full_path = logo_full_path;
    }
}
