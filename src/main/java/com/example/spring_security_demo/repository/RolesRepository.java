package com.example.spring_security_demo.repository;

import com.example.spring_security_demo.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

    Optional<Roles> findByName(String name);
}
