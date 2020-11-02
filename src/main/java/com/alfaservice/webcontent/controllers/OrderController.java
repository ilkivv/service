package com.alfaservice.webcontent.controllers;

import com.alfaservice.webcontent.entities.Device;
import com.alfaservice.webcontent.entities.Order;
import com.alfaservice.webcontent.entities.TypeDevice;
import com.alfaservice.webcontent.interfaces.DeviceRepository;
import com.alfaservice.webcontent.interfaces.OrderRepository;
import com.alfaservice.webcontent.interfaces.TypeDeviceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class OrderController extends IndexController {

    private final OrderRepository orderRepository;
    private final DeviceRepository deviceRepository;
    private final TypeDeviceRepository typeDeviceRepository;

    private static final String ORDERS_PAGE = "pages/order/orders";
    private static final String ORDER_ADD_PAGE = "pages/order/add";

    private static final String ORDERS_PATH = "/orders";
    private static final String ORDER_ADD_PATH = "/order/add";

    public OrderController(OrderRepository orderRepository, DeviceRepository deviceRepository, TypeDeviceRepository typeDeviceRepository) {
        this.orderRepository = orderRepository;
        this.deviceRepository = deviceRepository;
        this.typeDeviceRepository = typeDeviceRepository;
    }

    @GetMapping(path = ORDERS_PATH)
    public String showOrders(Map<String, Object> model){
        Iterable<Order> orders = orderRepository.findAll();
        model.put("orders", orders);
        return ORDERS_PAGE;
    }

    @GetMapping(path = ORDER_ADD_PATH)
    public String showOrderForm(Map<String, Object> model){
        Iterable<Device> devices = deviceRepository.findAll();
        Iterable<TypeDevice> type_devices = typeDeviceRepository.findAll();
        model.put("devices", devices);
        model.put("type_devices", type_devices);
        return ORDER_ADD_PAGE;
    }

    @PostMapping(path = ORDER_ADD_PATH)
    public String addNewOrder(Map<String, Object> model){
        Order order = new Order();
        order.setNotes_order("всякая параша");
        orderRepository.save(order);
        return ORDER_ADD_PAGE;
    }

}
