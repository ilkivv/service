package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Appearance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppearanceRepository extends JpaRepository<Appearance, Long> {

    @Override
    List<Appearance> findAll();

}
