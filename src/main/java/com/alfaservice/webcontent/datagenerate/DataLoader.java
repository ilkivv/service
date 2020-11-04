package com.alfaservice.webcontent.datagenerate;

import com.alfaservice.webcontent.entities.*;
import com.alfaservice.webcontent.interfaces.*;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private final ModelProductRepository modelProductRepository;
    private final TypeOrderRepository typeOrderRepository;
    private final TypeProductRepository typeProductRepository;
    private final BrandRepository brandRepository;
    private final AppearanceRepository appearanceRepository;
    private final DefectRepository defectRepository;
    private final EquipmentRepository equipmentRepository;
    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;

    @Autowired
    public DataLoader(
            ModelProductRepository modelProductRepository,
            TypeOrderRepository typeOrderRepository,
            TypeProductRepository typeProductRepository,
            BrandRepository brandRepository,
            AppearanceRepository appearanceRepository,
            DefectRepository defectRepository,
            EquipmentRepository equipmentRepository, RoleRepository roleRepository,
            PermissionRepository permissionRepository
    ) {
        this.modelProductRepository = modelProductRepository;
        this.typeOrderRepository = typeOrderRepository;
        this.typeProductRepository = typeProductRepository;
        this.brandRepository = brandRepository;
        this.appearanceRepository = appearanceRepository;
        this.defectRepository = defectRepository;
        this.equipmentRepository = equipmentRepository;
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        brandRepository.save(new Brand("Xiaomi"));
        brandRepository.save(new Brand("Apple"));
        brandRepository.save(new Brand("Samsung"));
        brandRepository.save(new Brand("Alcatel"));

        modelProductRepository.save(new ModelProduct("Redmi note 4"));
        modelProductRepository.save(new ModelProduct("Poco Phone"));
        modelProductRepository.save(new ModelProduct("Iphone 7"));
        modelProductRepository.save(new ModelProduct("Iphone 6"));

        typeOrderRepository.save(new TypeOrder("Платный"));
        typeOrderRepository.save(new TypeOrder("По гарантии"));
        typeOrderRepository.save(new TypeOrder("Бесплатный"));
        typeOrderRepository.save(new TypeOrder("По акции"));

        typeProductRepository.save(new TypeProduct("Смартфон"));
        typeProductRepository.save(new TypeProduct("Планшет"));
        typeProductRepository.save(new TypeProduct("Ноутбук"));
        typeProductRepository.save(new TypeProduct("Компьютер"));
        typeProductRepository.save(new TypeProduct("Телевизор"));

        appearanceRepository.save(new Appearance("потертости"));
        appearanceRepository.save(new Appearance("царапины"));
        appearanceRepository.save(new Appearance("трещины на экране"));
        appearanceRepository.save(new Appearance("нет крышки"));
        appearanceRepository.save(new Appearance("трещины на рамке"));

        defectRepository.save(new Defect("Разбит дисплей"));
        defectRepository.save(new Defect("Разбит тачскрин"));
        defectRepository.save(new Defect("Меня не слышно"));
        defectRepository.save(new Defect("Я не слышу"));
        defectRepository.save(new Defect("Не заряжается"));

        equipmentRepository.save(new Equipment("Аппарат"));
        equipmentRepository.save(new Equipment("Блок питания"));
        equipmentRepository.save(new Equipment("Коробка"));
        equipmentRepository.save(new Equipment("Ценник"));

        roleRepository.save(new Role("Пользователь", "user"));
        roleRepository.save(new Role("Администратор", "administrator"));
        roleRepository.save(new Role("Менеджер", "manager"));
        roleRepository.save(new Role("Мастер", "master"));

        permissionRepository.save(new Permission("Удалять", "delete"));
        permissionRepository.save(new Permission("Изменять", "rename"));
    }
}
