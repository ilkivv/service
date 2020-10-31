package com.alfaservice.webcontent.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_devices")
public class TypeDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public TypeDevice(){}

    public TypeDevice(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
