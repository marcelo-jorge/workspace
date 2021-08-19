package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.BancoHoras;
import com.bootCampSantander.controlePonto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository){
           this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras create(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void delete(Long id){
        bancoHorasRepository.deleteById(id);
    }

    public List<BancoHoras> findAll(){
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> findById(Long id){
        return bancoHorasRepository.findById(id);
    }
}
