package com.api.bazar.controller;

import com.api.bazar.model.Cliente;
import com.api.bazar.model.Producto;
import com.api.bazar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService clientServ;

    @PostMapping("/clientes/crear")
    public String createCliente(Cliente client){
        clientServ.saveClient(client);
        return "El cliente se creo con exito";
    }

    @GetMapping("/clientes")
    public List<Cliente> getClient(){
        List<Cliente> listClients = clientServ.getClients();
        return listClients;
    }

    @GetMapping("/clientes/{id}")
    public Cliente getClient(@PathVariable("id") Long id){
        Cliente clien = clientServ.findClient(id);
        return clien;
    }

    @DeleteMapping("/clientes/eliminar/{id}")
    public String deleteProduct(@PathVariable ("id") Long id){
        clientServ.deleteClient(id);
        return "El cliente fue eliminado con exito";
    }

    @PostMapping("/clientes/edtar/{id}")
    public Cliente editProduct(@PathVariable ("id") Long id,
                                @RequestParam(required = false, name = "nombre") String nuevoNombre,
                                @RequestParam(required = false, name = "apellido") String nuevoApellido,
                                @RequestParam(required = false, name = "dni") String nuevoDni){
        clientServ.editClient(id, nuevoNombre, nuevoApellido, nuevoDni);
        Cliente clien = clientServ.findClient(id);

        return clien;
    }
}
