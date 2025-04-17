package com.api.bazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private List<Producto> listaProductos;
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
