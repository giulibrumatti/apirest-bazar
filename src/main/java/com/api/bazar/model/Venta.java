package com.api.bazar.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codVenta;
    private LocalDate fechaVenta;
    private Double montoTotal;
    @OneToMany(mappedBy="venta")
    @JsonManagedReference
    private List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(Long codVenta, LocalDate fechaVenta, Double montoTotal, List<Producto> listaProductos, Cliente unCliente) {
        this.codVenta = codVenta;
        this.fechaVenta = fechaVenta;
        this.montoTotal = montoTotal;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }
}
