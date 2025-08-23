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
@Table(name = "empleado")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empleado {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer empleadoId;
    @ManyToOne
    @JoinColumn(name = "rolId", referencedColumnName = "idRol")
    private Rol rolId;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String telefono;
    @Column
    private String correo;
    @Column
    private String contrasena;

    @OneToMany(mappedBy = "empleadoId")
    private java.util.List<Venta> ventas;
}
