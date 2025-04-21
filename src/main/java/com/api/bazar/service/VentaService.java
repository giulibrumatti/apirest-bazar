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
        saleRep.save(sale);
    }

    @Override
    public void deleteSale(Long id) {
        saleRep.deleteById(id);
    }

    @Override
    public List<Venta> getSales() {
        List<Venta> listSales = saleRep.findAll();
        return listSales;
    }

    @Override
    public void editSale(Venta sale) {
        saleRep.save(sale);
    }

    @Override
    public void editSale(Long codVentaOr, LocalDate fechaNueva, Double montoNuevo) {

        Venta sale = this.findVenta(codVentaOr);
        sale.setFechaVenta(fechaNueva);
        sale.setMontoTotal(montoNuevo);
    }

    @Override
    public Venta findVenta(Long id) {
        Venta sale = saleRep.findById(id).orElse(null);
        return sale;
    }
}
