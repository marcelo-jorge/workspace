package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.Ocorrencia;
import com.bootCampSantander.controlePonto.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    
    OcorrenciaRepository ocorrenciaRepository;

    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public Ocorrencia create(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void delete(Long idOcorrencia){
        ocorrenciaRepository.deleteById(idOcorrencia);
    }

    public List<Ocorrencia> findAll(){
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> findById(Long idOcorrencia){
        return ocorrenciaRepository.findById(idOcorrencia);
    }
}
