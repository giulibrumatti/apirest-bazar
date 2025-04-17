package com.api.bazar.service;

import com.api.bazar.model.Cliente;
import com.api.bazar.model.Producto;
import com.api.bazar.model.Venta;
import com.api.bazar.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class VentaService implements IVentaService{

    @Autowired
    private IVentaRepository saleRep;

    @Override
    public void saveSale(Venta sale) {

    }

    @Override
    public void deleteSale(Long id) {

    }

    @Override
    public List<Venta> getSales() {
        return List.of();
    }

    @Override
    public void editSale(Venta sale) {

    }

    @Override
    public void editSale(Long codVentaOr, LocalDate fechaNueva, Double montoNuevo, List<Producto> nuevaListaPro, Cliente nuevoCliente) {

    }
}
