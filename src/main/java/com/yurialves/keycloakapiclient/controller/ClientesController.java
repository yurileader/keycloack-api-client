package com.yurialves.keycloakapiclient.controller;

import com.yurialves.keycloakapiclient.model.Clientes;
import com.yurialves.keycloakapiclient.service.ClientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClientesController {

    private final ClientesService clientesService;

    public List<Clientes> buscarListaClientes (){
        return  clientesService.buscarClientes();
    }
}
