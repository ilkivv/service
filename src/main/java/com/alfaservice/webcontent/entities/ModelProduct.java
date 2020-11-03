package com.alfaservice.webcontent.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "model_products")
public class ModelProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "modelProducts")
    private Collection<Order> orders;

    public ModelProduct(){}

    public ModelProduct(String name){
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

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

}
