package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.BancoHoras;
import com.bootCampSantander.controlePonto.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BancoHoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras create(@RequestBody BancoHoras bancoHoras){
       return bancoHorasService.create(bancoHoras);
    }

    @PutMapping
    public BancoHoras update(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.update(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public HttpStatus delete(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception{
        try{
            bancoHorasService.delete(idBancoHoras);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<BancoHoras> findAll(){
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> findById(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception{
        return ResponseEntity.ok(bancoHorasService.findById(idBancoHoras).orElseThrow(
                () -> new Exception("BancoHoras não Encontrado")
        ));
    }
}
