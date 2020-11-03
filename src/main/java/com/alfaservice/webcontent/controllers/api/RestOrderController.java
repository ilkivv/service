package com.alfaservice.webcontent.controllers.api;

import com.alfaservice.webcontent.entities.Order;
import com.alfaservice.webcontent.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
@CrossOrigin(origins = "*")
public class RestOrderController {

    private final OrderRepository orderRepository;

    private static final String GET_ALL_ORDERS_PATH = "/all";

    @Autowired
    public RestOrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping(path = GET_ALL_ORDERS_PATH)
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<List<Order>>(orderRepository.findAll(), HttpStatus.OK);
    }

}
