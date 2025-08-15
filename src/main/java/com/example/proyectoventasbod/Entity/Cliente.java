package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@Data
public class Cliente {
    private Integer clienteId;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String contrasena;
}
