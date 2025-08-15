package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class DetalleVentaProducto {
    private int idDetalleVentaProducto;
    private int ventaId;
    private int productoId;
    private int cantidad;
    private Double precioUnitario;
    private Double descuento;
    private Double total;
}
