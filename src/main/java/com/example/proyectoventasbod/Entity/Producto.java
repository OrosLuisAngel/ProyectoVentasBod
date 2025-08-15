package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer productoId;
    @Column
    private int categoriaId;
    @Column
    private int proveedorId;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Double precio;
    @Column
    private Integer cantidad;
}
