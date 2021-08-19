package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.Ocorrencia;
import com.bootCampSantander.controlePonto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ocorrencia")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia create(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.create(ocorrencia);
    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.update(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public HttpStatus delete(@PathVariable("idOcorrencia") Long idOcorrencia){
        try{
            ocorrenciaService.delete(idOcorrencia);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<Ocorrencia> findAll(){
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> findById(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception{
        return ResponseEntity.ok(ocorrenciaService.findById(idOcorrencia).orElseThrow(
                () -> new Exception("Ocorrencia não Encontrada")
        ));
    }
}
