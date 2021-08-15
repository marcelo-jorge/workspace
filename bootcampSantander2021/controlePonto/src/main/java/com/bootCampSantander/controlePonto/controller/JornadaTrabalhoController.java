package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.JornadaTrabalho;
import com.bootCampSantander.controlePonto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    //inserir dados no banco
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }



}
