package com.yurialves.keycloakapiclient.service;

import com.yurialves.keycloakapiclient.model.Clientes;
import com.yurialves.keycloakapiclient.repository.ClientesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientesService {

    private final ClientesRepository clientesRepository;

    public List<Clientes> buscarClientes() {
        return clientesRepository.findAll();
    }
}
