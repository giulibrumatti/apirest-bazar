package com.api.bazar.service;

import com.api.bazar.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClienteService {

    public void saveClient(Cliente client);

    public void deleteClient(Long id);

    public List<Cliente> getClients();

    public void editClient(Cliente client);

    public void editClient(Long idOriginal, String nuevoNombre, String nuevoApellido, String nuevoDni);

    public Cliente findClient(Long id);
}
