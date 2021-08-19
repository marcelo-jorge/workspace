package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.Empresa;
import com.bootCampSantander.controlePonto.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa create(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void delete(Long idEmpresa){
        empresaRepository.deleteById(idEmpresa);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(Long idEmpresa){
        return empresaRepository.findById(idEmpresa);
    }
}
