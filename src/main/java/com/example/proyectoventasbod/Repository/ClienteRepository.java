package com.example.proyectoventasbod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectoventasbod.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
