package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetalleVentaProducto {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int idDetalleVentaProducto;
    @ManyToOne
    @JoinColumn(name = "ventaId", referencedColumnName = "idVenta")
    private Venta ventaId;
    @ManyToOne
    @JoinColumn(name = "productoId", referencedColumnName = "productoId")
    private Producto productoId;
    @Column
    private int cantidad;
    @Column
    private Double precioUnitario;
    @Column
    private Double descuento;
    @Column
    private Double total;

}
