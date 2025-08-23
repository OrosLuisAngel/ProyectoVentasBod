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
public class Venta {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int idVenta;
    @ManyToOne
    @JoinColumn(name = "empleadoId", referencedColumnName = "empleadoId")
    private Empleado empleadoId;
    @ManyToOne
    @JoinColumn(name = "clienteId", referencedColumnName = "clienteId")
    private Cliente clienteId;
    @Column
    private String fecha;
    @Column
    private Double total;

    @OneToMany(mappedBy = "ventaId")
    private java.util.List<DetalleVentaProducto> detalleVentaProductos;
}
