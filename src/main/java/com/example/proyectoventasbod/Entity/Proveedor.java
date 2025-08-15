package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "proveedor")
@AllArgsConstructor
@Data
public class Proveedor {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer proveedorId;
    @Column
    private String nombre;
    @Column
    private String telefono;
}
