package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.TypeDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeDeviceRepository extends CrudRepository<TypeDevice, Long> {
    @Override
    List<TypeDevice> findAll();
}
