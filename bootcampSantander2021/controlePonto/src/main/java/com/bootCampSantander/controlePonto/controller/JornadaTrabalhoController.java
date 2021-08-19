package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.JornadaTrabalho;
import com.bootCampSantander.controlePonto.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/JornadaTrabalho")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    //inserir
    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.create(jornadaTrabalho);
    }

    //atualizar
    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    //deletar
    @DeleteMapping("/{idJornada}")
    public HttpStatus delete(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaTrabalhoService.delete(idJornada);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    //lista todos
    @GetMapping
    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoService.findAll();
    }

    //buscar por id
    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.findById(idJornada).orElseThrow(
                () -> new Exception("Jornada não Encontrada")
        ));
    }

}