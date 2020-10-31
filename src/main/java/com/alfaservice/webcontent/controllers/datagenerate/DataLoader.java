package com.alfaservice.webcontent.controllers.datagenerate;

import com.alfaservice.webcontent.entities.Device;
import com.alfaservice.webcontent.entities.TypeDevice;
import com.alfaservice.webcontent.interfaces.DeviceRepository;
import com.alfaservice.webcontent.interfaces.TypeDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private final DeviceRepository deviceRepository;
    private final TypeDeviceRepository typeDeviceRepository;

    @Autowired
    public DataLoader(DeviceRepository deviceRepository, TypeDeviceRepository typeDeviceRepository) {
        this.deviceRepository = deviceRepository;
        this.typeDeviceRepository = typeDeviceRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        deviceRepository.save(new Device("Xiaomi"));
        deviceRepository.save(new Device("Apple"));
        deviceRepository.save(new Device("Samsung"));
        deviceRepository.save(new Device("Alcatel"));

        typeDeviceRepository.save(new TypeDevice("Платный"));
        typeDeviceRepository.save(new TypeDevice("По гарантии"));
        typeDeviceRepository.save(new TypeDevice("Бесплатный"));
        typeDeviceRepository.save(new TypeDevice("По акции"));
    }
}
