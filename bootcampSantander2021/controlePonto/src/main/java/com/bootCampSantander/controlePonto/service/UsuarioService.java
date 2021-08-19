package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.Usuario;
import com.bootCampSantander.controlePonto.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario create(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void delete(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long idUsuario){
        return usuarioRepository.findById(idUsuario);
    }
}
