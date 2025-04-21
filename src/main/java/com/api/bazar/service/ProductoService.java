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
        productRep.save(product);

    }

    @Override
    public void deleteProduct(Long id) {
        productRep.deleteById(id);
    }

    @Override
    public List<Producto> getProducts() {
        List<Producto> listProduct = productRep.findAll();
        return listProduct;
    }

    @Override
    public Producto findProduct(Long id) {
        Producto product = productRep.findById(id).orElse(null);
        return product;
    }

    @Override
    public void editProduct(Producto product) {
        productRep.save(product);
    }

    @Override
    public void editProduct(Long codProdOr, String nuevoNombre, String nuevaMarca,
                            Double nuevoCosto, Integer nuevoStock) {
        Producto product = this.findProduct(codProdOr);
        product.setCantidadStock(nuevoStock);
        product.setCosto(nuevoCosto);
        product.setNombre(nuevoNombre);
        product.setMarca(nuevaMarca);
        productRep.save(product);
    }
}
