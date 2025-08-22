package com.example.proyectoventasbod.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectoventasbod.Entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
