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

    @Autowired
    public DataLoader(ModelProductRepository modelProductRepository, TypeOrderRepository typeOrderRepository, TypeProductRepository typeProductRepository, BrandRepository brandRepository) {
        this.modelProductRepository = modelProductRepository;
        this.typeOrderRepository = typeOrderRepository;
        this.typeProductRepository = typeProductRepository;
        this.brandRepository = brandRepository;
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
    }
}
