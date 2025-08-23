package com.example.proyectoventasbod.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categoria")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Catagoria {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer categoriaId;
    @Column
    private String nombre;
    @Column
    private String descripcion;

    @OneToMany(mappedBy = "categoriaId")
    private java.util.List<Producto> productos;
}
