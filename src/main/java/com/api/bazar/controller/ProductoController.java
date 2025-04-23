package com.api.bazar.controller;

import com.api.bazar.model.Producto;
import com.api.bazar.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService prodServ;

    @PostMapping("/productos/crear")
    public String createProduct(@RequestBody Producto product){
        prodServ.saveProduct(product);
        return "El producto se creo correctamente";
    }

    @GetMapping("/productos")
    public List<Producto> getProducts(){
        List<Producto> listProducts = prodServ.getProducts();
        return listProducts;
    }

    @GetMapping("/productos/{id}")
    public Producto getProducto(@PathVariable ("id") Long id){
        Producto prod = prodServ.findProduct(id);
        return prod;
    }

    @DeleteMapping("/productos/eliminar/{id}")
    public String deleteProduct(@PathVariable ("id") Long id){
        prodServ.deleteProduct(id);
        return "El producto fue eliminado con exito";
    }

    @PutMapping("/productos/editar/{id}")
    public Producto editProduct(@PathVariable ("id") Long id,
                                @RequestParam(required = false, name = "nombre") String nuevoNombre,
                                @RequestParam(required = false, name = "marca") String nuevaMarca,
                                @RequestParam(required = false, name = "costo") Double nuevoCosto,
                                @RequestParam(required = false, name = "cantidadStock") Integer nuevoStock){
        prodServ.editProduct(id, nuevoNombre, nuevaMarca, nuevoCosto, nuevoStock);
        Producto prod = prodServ.findProduct(id);

        return prod;
    }

}
