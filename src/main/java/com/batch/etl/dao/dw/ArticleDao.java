package com.batch.etl.dao.dw;

import com.batch.etl.domain.dw.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

@Qualifier("dwArticleDao")
public interface ArticleDao extends JpaRepository<Article, Integer> {
}
