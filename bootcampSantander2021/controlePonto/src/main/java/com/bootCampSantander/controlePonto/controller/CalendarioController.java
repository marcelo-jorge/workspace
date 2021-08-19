package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.Calendario;
import com.bootCampSantander.controlePonto.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario create(@RequestBody Calendario calendario){
        return calendarioService.create(calendario);
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public HttpStatus delete(@PathVariable("idCalendario") Long idCalendario){
        try{
            calendarioService.delete(idCalendario);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<Calendario> findAll(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> findById(@PathVariable("idCalendario") Long idCalendario) throws Exception {
        return ResponseEntity.ok(calendarioService.findById(idCalendario).orElseThrow(
                () -> new Exception("Calendario não Encontrado")
        ));
    }
}
