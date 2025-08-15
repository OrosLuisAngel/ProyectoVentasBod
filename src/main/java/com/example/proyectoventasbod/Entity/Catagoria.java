package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "categoria")
@AllArgsConstructor
@Data
public class Catagoria {
    private Integer categoriaId;
    private String nombre;
    private String descripcion;
}
