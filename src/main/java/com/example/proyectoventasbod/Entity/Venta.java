package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Venta {
    private int idVenta;
    private int empleadoId;
    private int clienteId;
    private String fecha;
    private Double total;
}
