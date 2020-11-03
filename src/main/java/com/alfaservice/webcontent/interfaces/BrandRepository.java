package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {

    @Override
    List<Brand> findAll();

}
