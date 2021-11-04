package com.yurialves.keycloakapiclient.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ClientesDTO {

    private int id;
    private String nome;
    private BigDecimal salarios;
    private String email;
}
