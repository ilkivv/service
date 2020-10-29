package com.alfaservice.webcontent.entities;

import javax.persistence.*;

@Entity
@Table(name = "settings")
public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String value;

    protected Setting(){}

    public Setting(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
