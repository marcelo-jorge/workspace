package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.CategoriaUsuario;
import com.bootCampSantander.controlePonto.repository.CategoriaUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    CategoriaUsuarioRepository categoriaUsuarioRepository;

    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario create(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void delete(Long idCategoriaUsuario){
        categoriaUsuarioRepository.deleteById(idCategoriaUsuario);
    }

    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> findById(Long idCategoriaUsuario){
        return categoriaUsuarioRepository.findById(idCategoriaUsuario);
    }
}
