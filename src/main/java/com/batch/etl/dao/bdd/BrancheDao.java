package com.batch.etl.dao.bdd;

import com.batch.etl.domain.bdd.Branche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrancheDao extends JpaRepository<Branche, Integer> {
}
