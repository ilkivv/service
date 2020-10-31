package com.alfaservice.webcontent.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Short type_order_id;
    private Float orient_price;
    private Float prepayment;
    private Boolean urgency;
    private String notes_order;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "orders_devices",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "device_id")
    )
    private Collection<Device> devices;

    public Order(){}

    public Short getType_order_id() {
        return type_order_id;
    }

    public void setType_order_id(Short type_order) {
        this.type_order_id = type_order_id;
    }

    public Float getOrient_price() {
        return orient_price;
    }

    public void setOrient_price(Float orient_price) {
        this.orient_price = orient_price;
    }

    public Boolean getUrgency() {
        return urgency;
    }

    public void setUrgency(Boolean urgency) {
        this.urgency = urgency;
    }

    public Float getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(Float prepayment) {
        this.prepayment = prepayment;
    }

    public String getNotes_order() {
        return notes_order;
    }

    public void setNotes_order(String notes_order) {
        this.notes_order = notes_order;
    }

    public Collection<Device> getDevices() {
        return devices;
    }

    public void setDevices(Collection<Device> devices) {
        this.devices = devices;
    }
}
