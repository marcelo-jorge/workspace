package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.BancoHoras;
import com.bootCampSantander.controlePonto.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BancoHora")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    //inserir
    @PostMapping
    public BancoHoras saveBancohoras(@RequestBody BancoHoras bancoHoras){
       return bancoHorasService.saveBancoHoras(bancoHoras);
    }
}
