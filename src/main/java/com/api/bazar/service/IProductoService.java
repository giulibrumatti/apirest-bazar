package com.api.bazar.service;

import com.api.bazar.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductoService {

    public void saveProduct(Producto product);

    public void deleteProduct(Long id);

    public List<Producto> getProducts();

    public Producto findProduct(Long id);

    public void editProduct(Producto product);

    public void editProduct(Long codProdOr, String nuevoNombre, String nuevaMarca, Double nuevoCosto, Integer nuevoStock);
}
