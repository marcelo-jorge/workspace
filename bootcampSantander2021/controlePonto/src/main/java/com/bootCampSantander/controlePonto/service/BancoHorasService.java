package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.BancoHoras;
import com.bootCampSantander.controlePonto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class BancoHorasService {

    @Autowired
    BancoHorasRepository bancoHorasRepository;

    public BancoHoras saveBancoHoras(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }
}
