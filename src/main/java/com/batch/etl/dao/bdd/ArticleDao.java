package com.batch.etl.dao.bdd;

import com.batch.etl.domain.bdd.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

@Qualifier("bddArticleDao")
public interface ArticleDao extends JpaRepository<Article, Integer> {
}
