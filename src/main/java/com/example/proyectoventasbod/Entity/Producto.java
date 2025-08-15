package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@Data
public class Producto {
    private Integer productoId;
    private int categoriaId;
    private int proveedorId;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;
}
