package com.batch.etl.dao.dw;

import com.batch.etl.domain.dw.Temps;
import com.batch.etl.domain.dw.VentesPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesDao extends JpaRepository<Temps, VentesPK> {
}
