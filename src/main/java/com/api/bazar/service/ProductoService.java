package com.api.bazar.service;

import com.api.bazar.model.Producto;
import com.api.bazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository productRep;

    @Override
    public void saveProduct(Producto product) {

    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<Producto> getProducts() {
        return List.of();
    }

    @Override
    public void editProduct(Producto product) {

    }

    @Override
    public void editProduct(Long codProdOr, String nuevoNombre, String nuevaMarca, Double nuevoCosto, Integer nuevoStock) {

    }
}
