package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.TipoData;
import com.bootCampSantander.controlePonto.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TipoData")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData create(@RequestBody TipoData tipoData){
        return tipoDataService.create(tipoData);
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData){
        return tipoDataService.update(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public HttpStatus delete(@PathVariable("idTipoData") Long idTipoData){
        try{
            tipoDataService.delete(idTipoData);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<TipoData> findAll(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> findById(@PathVariable("idTipoData") Long idTipoData) throws Exception{
        return ResponseEntity.ok(tipoDataService.findById(idTipoData).orElseThrow(
                () -> new Exception("TipoData não Encontrada")
        ));
    }
}
