package com.alfaservice.webcontent.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Short type_order_id;
    private Long device_id;

    protected Order(){}

    public Order(Short type_order_id, Long device_id){
        this.type_order_id = type_order_id;
        this.device_id = device_id;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getType_order_id() {
        return type_order_id;
    }

    public void setType_order_id(Short type_order) {
        this.type_order_id = type_order_id;
    }

    public Long getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Long device_id) {
        this.device_id = device_id;
    }
}
