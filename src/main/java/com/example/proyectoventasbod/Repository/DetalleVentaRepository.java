package com.example.proyectoventasbod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectoventasbod.Entity.DetalleVentaProducto;

public interface DetalleVentaRepository extends JpaRepository<DetalleVentaProducto, Integer> {

}
