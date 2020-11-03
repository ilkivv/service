package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    @Override
    List<Equipment> findAll();
}
