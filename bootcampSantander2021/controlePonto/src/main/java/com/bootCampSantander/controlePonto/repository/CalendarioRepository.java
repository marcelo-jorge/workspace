package com.bootCampSantander.controlePonto.repository;

import com.bootCampSantander.controlePonto.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}
