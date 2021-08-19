package com.bootCampSantander.controlePonto.controller;

import com.bootCampSantander.controlePonto.model.Usuario;
import com.bootCampSantander.controlePonto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public HttpStatus delete(@PathVariable("idUsuario") Long idUsuario){
        try{
            usuarioService.delete(idUsuario);
            return HttpStatus.OK;
        }catch (Exception e){
            return HttpStatus.valueOf(e.getMessage());
        }
    }

    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> findById(@PathVariable("idUsuario") Long idUsuario) throws Exception{
        return ResponseEntity.ok(usuarioService.findById(idUsuario).orElseThrow(
                () -> new Exception("Usuario não Encontrada")
        ));
    }
}
