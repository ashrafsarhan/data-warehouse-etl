package com.batch.etl.dao.dw;

import com.batch.etl.domain.dw.Emplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplacementDao extends JpaRepository<Emplacement, Integer> {
}
