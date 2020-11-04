package com.alfaservice.webcontent.interfaces;

import com.alfaservice.webcontent.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Override
    List<Role> findAll();
}
