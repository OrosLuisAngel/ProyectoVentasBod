package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "empleado")
@AllArgsConstructor
@Data
public class Empleado {
    private Integer empleadoId;
    private int rolId;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contrasena;
}
