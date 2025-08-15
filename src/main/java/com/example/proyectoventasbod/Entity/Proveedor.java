package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "proveedor")
@AllArgsConstructor
@Data
public class Proveedor {
    private Integer proveedorId;
    private String nombre;
    private String telefono;
}
