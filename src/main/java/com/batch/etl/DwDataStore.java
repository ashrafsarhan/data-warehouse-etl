package com.batch.etl;

import com.batch.etl.dao.dw.ArticleDao;
import com.batch.etl.dao.dw.EmplacementDao;
import com.batch.etl.dao.dw.TempsDao;
import com.batch.etl.dao.dw.VentesDao;
import com.batch.etl.domain.dw.Temps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DwDataStore {

    @Autowired
    private ArticleDao dwArticleDao;

    @Autowired
    private EmplacementDao emplacementDao;

    @Autowired
    private TempsDao tempsDao;

    @Autowired
    private VentesDao ventesDao;

    public ArticleDao getDwArticleDao() {
        return dwArticleDao;
    }

    public EmplacementDao getEmplacementDao() {
        return emplacementDao;
    }

    public TempsDao getTempsDao() {
        return tempsDao;
    }

    public VentesDao getVentesDao() {
        return ventesDao;
    }
}
