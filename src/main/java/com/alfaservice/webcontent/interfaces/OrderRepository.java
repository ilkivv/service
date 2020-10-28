package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository  extends CrudRepository<Order, Long> {

    List<Order> findById(long id);

}
