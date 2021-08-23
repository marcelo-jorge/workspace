package com.dio.gerenciamentoDePessoas.controller;

import com.dio.gerenciamentoDePessoas.dto.PessoaDTO;
import com.dio.gerenciamentoDePessoas.entity.Pessoa;
import com.dio.gerenciamentoDePessoas.exception.PessoaNotFoundExcetion;
import com.dio.gerenciamentoDePessoas.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pessoa")
public class PessoaController {

    PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public Pessoa create(@RequestBody PessoaDTO pessoaDTO){
        return pessoaService.create(pessoaDTO);
    }

    @PutMapping
    public Pessoa update(@RequestBody PessoaDTO pessoaDTO){
        return pessoaService.update(pessoaDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws PessoaNotFoundExcetion {
        pessoaService.delete(id);
    }

    @GetMapping
    public List<PessoaDTO> findAll(){
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable Long id) throws PessoaNotFoundExcetion {
        return pessoaService.findById(id);
    }
}
