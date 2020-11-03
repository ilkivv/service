package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.ModelProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelProductRepository extends JpaRepository<ModelProduct, Long> {

    @Override
    List<ModelProduct> findAll();
}
