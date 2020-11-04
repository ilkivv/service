package com.alfaservice.webcontent.entities;

import javax.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String signature;

    public Permission(){}

    public Permission(String name){
        this.name = name;
        this.signature = Transcriptor.translitRuToEn(name);
    }

    public Permission(String name, String signature){
        this.name = name;
        this.signature = signature;
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

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
