package com.dio.gerenciamentoDePessoas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoTelefone {

    CASA("Casa"),
    CELULAR("Celular"),
    TRABALHO("Trabalho");

    private final String descricao;

}
