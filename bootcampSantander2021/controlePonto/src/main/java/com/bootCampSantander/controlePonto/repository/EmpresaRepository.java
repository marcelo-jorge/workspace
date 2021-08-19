package com.bootCampSantander.controlePonto.repository;

import com.bootCampSantander.controlePonto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
