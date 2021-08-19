package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.Localidade;
import com.bootCampSantander.controlePonto.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade create(@RequestBody Localidade localidade){
        return localidadeService.create(localidade);
    }

    @PutMapping
    public Localidade update(@RequestBody Localidade localidade){
        return localidadeService.update(localidade);
    }

    @DeleteMapping("/{idLocalidade}")
    public HttpStatus delete(@PathVariable("idLocalidade") Long idLocalidade){
        try{
            localidadeService.delete(idLocalidade);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<Localidade> findAll(){
        return localidadeService.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> findById(@PathVariable("idLocalidade") Long idLocalidade) throws Exception{
        return ResponseEntity.ok(localidadeService.findById(idLocalidade).orElseThrow(
                () -> new Exception("Localidade não Encontrada")
        ));
    }
}
