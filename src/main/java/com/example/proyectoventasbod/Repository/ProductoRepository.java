package com.example.proyectoventasbod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectoventasbod.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
