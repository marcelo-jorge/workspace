package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.Empresa;
import com.bootCampSantander.controlePonto.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa){
        return empresaService.create(empresa);
    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public HttpStatus delete(@PathVariable("idEmpresa") Long idEmpresa){
        try{
            empresaService.delete(idEmpresa);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<Empresa> findAll(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> findById(@PathVariable("idEmpresa") Long idEmpresa) throws Exception{
        return ResponseEntity.ok(empresaService.findById(idEmpresa).orElseThrow(
                () -> new Exception("Empresa não Encontrada")
        ));
    }
}
