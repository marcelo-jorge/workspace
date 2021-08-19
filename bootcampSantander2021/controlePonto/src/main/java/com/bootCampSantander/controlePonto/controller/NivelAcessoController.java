package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.NivelAcesso;
import com.bootCampSantander.controlePonto.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NivelAcesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso create(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.create(nivelAcesso);
    }

    @PutMapping
    public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public HttpStatus delete(@PathVariable("idNivelAcesso") Long idNivelAcesso){
        try{
            nivelAcessoService.delete(idNivelAcesso);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<NivelAcesso> findAll(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> findById(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws Exception{
        return ResponseEntity.ok(nivelAcessoService.findById(idNivelAcesso).orElseThrow(
                () -> new Exception("NivelAcesso não Encontrada")
        ));
    }
}
