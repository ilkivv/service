package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {

    @Override
    List<TypeProduct> findAll();
}
