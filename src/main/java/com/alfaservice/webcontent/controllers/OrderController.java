package com.alfaservice.webcontent.controllers;

import com.alfaservice.webcontent.entities.*;
import com.alfaservice.webcontent.interfaces.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class OrderController extends IndexController {

    private final OrderRepository orderRepository;
    private final ModelProductRepository modelProductRepository;
    private final TypeOrderRepository typeOrderRepository;
    private final TypeProductRepository typeProductRepository;
    private final BrandRepository brandRepository;

    private static final String ORDERS_TEMPLATE_PAGE = "pages/orders";
    private static final String ADD_ORDER_TEMPLATE_PAGE = "pages/add-order";

    private static final String ORDERS_PATH = "/orders";
    private static final String ORDER_ADD_PATH = "/order/add";

    public OrderController(
            OrderRepository orderRepository,
            ModelProductRepository modelProductRepository,
            TypeProductRepository typeProductRepository,
            TypeOrderRepository TypeOrderRepository,
            BrandRepository brandRepository
    ) {
        this.orderRepository = orderRepository;
        this.modelProductRepository = modelProductRepository;
        this.typeOrderRepository = TypeOrderRepository;
        this.typeProductRepository = typeProductRepository;
        this.brandRepository = brandRepository;
    }

    @GetMapping(path = ORDERS_PATH)
    public String showOrders(Map<String, Object> model){
        Iterable<Order> orders = orderRepository.findAll();
        model.put("orders", orders);
        return ORDERS_TEMPLATE_PAGE;
    }

    @GetMapping(path = ORDER_ADD_PATH)
    public String showOrderForm(Map<String, Object> model){
        Iterable<ModelProduct> modelProducts = modelProductRepository.findAll();
        Iterable<TypeOrder> type_orders = typeOrderRepository.findAll();
        Iterable<TypeProduct> type_products = typeProductRepository.findAll();
        Iterable<Brand> brands = brandRepository.findAll();
        model.put("modelProducts", modelProducts);
        model.put("type_orders", type_orders);
        model.put("type_products", type_products);
        model.put("brands", brands);
        return ADD_ORDER_TEMPLATE_PAGE;
    }

    @PostMapping(path = ORDER_ADD_PATH)
    public String addNewOrder(Map<String, Object> model){
        Order order = new Order();
        order.setNotes_order("всякая параша");
        orderRepository.save(order);
        return ADD_ORDER_TEMPLATE_PAGE;
    }

}
