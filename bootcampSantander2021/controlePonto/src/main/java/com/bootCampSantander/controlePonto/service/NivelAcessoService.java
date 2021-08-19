package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.NivelAcesso;
import com.bootCampSantander.controlePonto.repository.NivelAcessoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

   public NivelAcesso create(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void delete(Long idNivelAcesso){
        nivelAcessoRepository.deleteById(idNivelAcesso);
    }

    public List<NivelAcesso> findAll(){
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> findById(Long idNivelAcesso){
        return nivelAcessoRepository.findById(idNivelAcesso);
    }
}
