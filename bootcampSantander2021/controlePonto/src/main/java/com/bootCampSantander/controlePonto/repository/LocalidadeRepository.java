package com.bootCampSantander.controlePonto.repository;

import com.bootCampSantander.controlePonto.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}
