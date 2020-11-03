package com.alfaservice.webcontent.entities;

import javax.persistence.*;

@Entity
@Table(name = "appearances")
public class Appearance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Appearance(){}

    public Appearance(String name){
        this.name = name;
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
}
