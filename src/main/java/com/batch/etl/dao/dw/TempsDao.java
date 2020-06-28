package com.batch.etl.dao.dw;

import com.batch.etl.domain.dw.Temps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempsDao extends JpaRepository<Temps, Integer> {
}
