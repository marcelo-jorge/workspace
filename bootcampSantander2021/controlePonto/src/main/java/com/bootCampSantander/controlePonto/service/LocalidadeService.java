package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.Localidade;
import com.bootCampSantander.controlePonto.repository.LocalidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    LocalidadeRepository localidadeRepository;

    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade create(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void delete(Long idLocalidade){
        localidadeRepository.deleteById(idLocalidade);
    }

    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> findById(Long idLocalidade){
        return localidadeRepository.findById(idLocalidade);
    }
}
