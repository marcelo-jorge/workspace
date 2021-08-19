package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.TipoData;
import com.bootCampSantander.controlePonto.repository.TipoDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    TipoDataRepository tipoDataRepository;

    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData create(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void delete(Long idTipoData){
        tipoDataRepository.deleteById(idTipoData);
    }

    public List<TipoData> findAll(){
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> findById(Long idTipoData){
        return tipoDataRepository.findById(idTipoData);
    }
}
