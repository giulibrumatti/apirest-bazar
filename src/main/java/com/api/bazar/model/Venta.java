package com.api.bazar.model;

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
    private Long codigoVenta;

    private LocalDate fechaVenta;
    private Double montoTotal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "codigo_venta")
    private List<Producto> listaProductos;

    @OneToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "idCliente")
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(Long codVenta, LocalDate fechaVenta, Double montoTotal, List<Producto> listaProductos, Cliente unCliente) {
        this.codigoVenta = codVenta;
        this.fechaVenta = fechaVenta;
        this.montoTotal = montoTotal;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }
}
