package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DefectRepository extends JpaRepository<Defect, Long> {
    @Override
    List<Defect> findAll();
}
