package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.Movimentacao;
import com.bootCampSantander.controlePonto.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.create(movimentacao);
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public HttpStatus delete(@PathVariable("idMovimentacao") Long idMovimentacao){
        try{
            movimentacaoService.delete(idMovimentacao);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<Movimentacao> findAll(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> findById(@PathVariable("idMovimentacao") Long idMovimentacao) throws Exception{
        return ResponseEntity.ok(movimentacaoService.findById(idMovimentacao).orElseThrow(
                () -> new Exception("Movimentacao não Encontrada")
        ));
    }
}
