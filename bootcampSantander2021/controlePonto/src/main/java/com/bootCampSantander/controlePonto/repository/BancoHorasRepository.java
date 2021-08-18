package com.bootCampSantander.controlePonto.repository;

import com.bootCampSantander.controlePonto.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
