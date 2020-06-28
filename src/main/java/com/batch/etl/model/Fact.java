package com.batch.etl.model;

import com.batch.etl.domain.dw.Article;
import com.batch.etl.domain.dw.Emplacement;
import com.batch.etl.domain.dw.Temps;
import com.batch.etl.domain.dw.Ventes;

public class Fact {

    private Article article;

    private Emplacement emplacement;

    private Temps temps;

    private Ventes ventes;

    public Fact(Article article, Emplacement emplacement, Temps temps, Ventes ventes) {
        this.article = article;
        this.emplacement = emplacement;
        this.temps = temps;
        this.ventes = ventes;
    }

    public Article getArticle() {
        return article;
    }

    public Emplacement getEmplacement() {
        return emplacement;
    }

    public Temps getTemps() {
        return temps;
    }

    public Ventes getVentes() {
        return ventes;
    }
}
