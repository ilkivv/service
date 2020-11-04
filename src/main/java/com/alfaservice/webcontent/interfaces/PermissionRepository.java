package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    @Override
    List<Permission> findAll();
}
