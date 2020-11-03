package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.TypeOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeOrderRepository extends CrudRepository<TypeOrder, Long> {
    @Override
    List<TypeOrder> findAll();
}
