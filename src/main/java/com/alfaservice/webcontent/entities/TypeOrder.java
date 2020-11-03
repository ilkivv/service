package com.alfaservice.webcontent.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_orders")
public class TypeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public TypeOrder(){}

    public TypeOrder(String name){
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
