package com.alfaservice.webcontent.controllers;

import com.alfaservice.webcontent.entities.*;
import com.alfaservice.webcontent.interfaces.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class OrderController extends IndexController {

    private final OrderRepository orderRepository;
    private final ModelProductRepository modelProductRepository;
    private final TypeOrderRepository typeOrderRepository;
    private final TypeProductRepository typeProductRepository;
    private final BrandRepository brandRepository;
    private final AppearanceRepository appearanceRepository;
    private final DefectRepository defectRepository;
    private final EquipmentRepository equipmentRepository;

    private static final String ORDERS_TEMPLATE_PAGE = "pages/orders";
    private static final String ADD_ORDER_TEMPLATE_PAGE = "pages/add-order";

    private static final String ORDER_ADD_PATH = "/order/add";
    private static final String ORDERS_PATH = "/orders";
    private static final String GET_ORDERS_JSON_PATH = "/get-orders";

    public OrderController(
            OrderRepository orderRepository,
            ModelProductRepository modelProductRepository,
            TypeProductRepository typeProductRepository,
            TypeOrderRepository TypeOrderRepository,
            BrandRepository brandRepository,
            AppearanceRepository appearanceRepository,
            DefectRepository defectRepository,
            EquipmentRepository equipmentRepository) {
        this.orderRepository = orderRepository;
        this.modelProductRepository = modelProductRepository;
        this.typeOrderRepository = TypeOrderRepository;
        this.typeProductRepository = typeProductRepository;
        this.brandRepository = brandRepository;
        this.appearanceRepository = appearanceRepository;
        this.defectRepository = defectRepository;
        this.equipmentRepository = equipmentRepository;
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
        Iterable<Appearance> appearances = appearanceRepository.findAll();
        Iterable<Defect> defects = defectRepository.findAll();
        Iterable<Equipment> equipments = equipmentRepository.findAll();
        model.put("modelProducts", modelProducts);
        model.put("type_orders", type_orders);
        model.put("type_products", type_products);
        model.put("brands", brands);
        model.put("appearances", appearances);
        model.put("defects", defects);
        model.put("equipments", equipments);
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
