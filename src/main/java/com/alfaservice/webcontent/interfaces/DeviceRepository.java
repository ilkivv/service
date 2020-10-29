package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Device;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Device, Long> {
    List<Device> findById(long id);
}
