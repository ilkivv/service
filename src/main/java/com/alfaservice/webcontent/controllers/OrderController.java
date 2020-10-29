package com.alfaservice.webcontent.controllers;

import com.alfaservice.webcontent.entities.Order;
import com.alfaservice.webcontent.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class OrderController extends HomeController{

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path = "/orders ")
    public String showOrders(Map<String, Object> model){
        Iterable<Order> orders = orderRepository.findAll();
        model.put("orders", orders);
        return "orders";
    }

    @GetMapping(path = "/order/add")
    public String showOrderForm(Map<String, Object> model){
        return "pages/order/add";
    }

    @PostMapping(path = "/order/add")
    public String addNewOrder(Map<String, Object> model){
        Order order = new Order();
        order.setNotes_order("всякая параша");
        orderRepository.save(order);
        return "pages/order/add";
    }

}