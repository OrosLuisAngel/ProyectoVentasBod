package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class DetalleVentaProducto {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int idDetalleVentaProducto;
    @Column
    private int ventaId;
    @Column
    private int productoId;
    @Column
    private int cantidad;
    @Column
    private Double precioUnitario;
    @Column
    private Double descuento;
    @Column
    private Double total;
}
