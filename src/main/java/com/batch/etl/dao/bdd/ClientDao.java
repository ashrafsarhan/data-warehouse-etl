package com.batch.etl.dao.bdd;

import com.batch.etl.domain.bdd.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Integer> {
}
