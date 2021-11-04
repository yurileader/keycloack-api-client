package com.yurialves.keycloakapiclient.controller;

import com.yurialves.keycloakapiclient.model.Clientes;
import com.yurialves.keycloakapiclient.service.ClientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClientesController {

    private final ClientesService clientesService;

    @PreAuthorize("hasAuthority('ROLE_GERENTE')")
    @GetMapping
    public List<Clientes> buscarListaClientes (){
        return  clientesService.buscarClientes();
    }
}
