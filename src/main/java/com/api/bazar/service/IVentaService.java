package com.api.bazar.service;

import com.api.bazar.model.Cliente;
import com.api.bazar.model.Producto;
import com.api.bazar.model.Venta;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public interface IVentaService {

    public void saveSale(Venta sale);

    public void deleteSale(Long id);

    public List<Venta> getSales();

    public void editSale(Venta sale);

    public void editSale(Long codVentaOr, LocalDate fechaNueva, Double montoNuevo, List<Producto> nuevaListaPro, Cliente nuevoCliente);


}
