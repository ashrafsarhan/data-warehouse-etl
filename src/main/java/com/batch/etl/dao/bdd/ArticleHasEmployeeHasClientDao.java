package com.batch.etl.dao.bdd;

import com.batch.etl.domain.bdd.ArticleHasEmployeeHasClient;
import com.batch.etl.domain.bdd.ArticleHasEmployeeHasClientPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleHasEmployeeHasClientDao extends JpaRepository<ArticleHasEmployeeHasClient, ArticleHasEmployeeHasClientPK> {
}
