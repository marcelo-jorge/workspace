package com.dio.gerenciamentoDePessoas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNotFoundExcetion extends Exception {
    public PessoaNotFoundExcetion(Long id) {
        super("Pessoa não encontrada com id: " + id);
    }
}
