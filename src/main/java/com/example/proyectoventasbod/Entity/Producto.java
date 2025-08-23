package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer productoId;
    @ManyToOne
    @JoinColumn(name = "categoriaId", referencedColumnName = "categoriaId")
    private Catagoria categoriaId;
    @ManyToOne
    @JoinColumn(name = "proveedorId", referencedColumnName = "proveedorId")
    private Proveedor proveedorId;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Double precio;
    @Column
    private Integer cantidad;

    @OneToMany(mappedBy = "productoId")
    private java.util.List<DetalleVentaProducto> detalleVentaProductos;
}
