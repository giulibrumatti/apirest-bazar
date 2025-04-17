package com.api.bazar.service;

import com.api.bazar.model.Cliente;
import com.api.bazar.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository clientRep;

    @Override
    public void saveClient(Cliente client) {
        clientRep.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRep.deleteById(id);
    }

    @Override
    public List<Cliente> getClients() {
        return List.of();
    }

    @Override
    public void editClient(Cliente client) {
        clientRep.save(client);
    }

    @Override
    public void editClient(Long idOriginal, String nuevoNombre, String nuevoApellido, String nuevoDni) {

    }
}
