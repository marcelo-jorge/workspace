package com.bootCampSantander.controlePonto.repository;

import com.bootCampSantander.controlePonto.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}
