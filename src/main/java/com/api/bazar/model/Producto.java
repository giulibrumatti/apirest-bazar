package com.api.bazar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codProducto;
    private String nombre;
    private String marca;
    private Double costo;
    private Integer cantidadStock;


    public Producto(){

    }

    public Producto(Long codProducto, String nombre, String marca, Double costo, Integer cantidadStock) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidadStock = cantidadStock;
    }
}
