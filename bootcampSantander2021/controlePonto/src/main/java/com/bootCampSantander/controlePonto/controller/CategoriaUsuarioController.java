package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.CategoriaUsuario;
import com.bootCampSantander.controlePonto.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CategoriaUsuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario create(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.create(categoriaUsuario);
    }

    @PutMapping
    public  CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    public HttpStatus delete(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario){
        try{
            categoriaUsuarioService.delete(idCategoriaUsuario);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> findById(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws Exception{
        return ResponseEntity.ok(categoriaUsuarioService.findById(idCategoriaUsuario).orElseThrow(
                () -> new Exception("CategoriaUsuario não Encontrada")
        ));
    }
}
