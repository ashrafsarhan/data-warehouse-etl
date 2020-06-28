package com.batch.etl.domain.dw;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VentesPK implements Serializable {
    private int idVentes;
    private int articleIdArticle;
    private int tempsIdTemps;
    private int emplacementIdEmplacement;

    @Column(name = "id_ventes")
    @Id
    public int getIdVentes() {
        return idVentes;
    }

    public void setIdVentes(int idVentes) {
        this.idVentes = idVentes;
    }

    @Column(name = "Article_id_Article")
    @Id
    public int getArticleIdArticle() {
        return articleIdArticle;
    }

    public void setArticleIdArticle(int articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

    @Column(name = "temps_id_temps")
    @Id
    public int getTempsIdTemps() {
        return tempsIdTemps;
    }

    public void setTempsIdTemps(int tempsIdTemps) {
        this.tempsIdTemps = tempsIdTemps;
    }

    @Column(name = "Emplacement_id_Emplacement")
    @Id
    public int getEmplacementIdEmplacement() {
        return emplacementIdEmplacement;
    }

    public void setEmplacementIdEmplacement(int emplacementIdEmplacement) {
        this.emplacementIdEmplacement = emplacementIdEmplacement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VentesPK ventesPK = (VentesPK) o;
        return idVentes == ventesPK.idVentes &&
                articleIdArticle == ventesPK.articleIdArticle &&
                tempsIdTemps == ventesPK.tempsIdTemps &&
                emplacementIdEmplacement == ventesPK.emplacementIdEmplacement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVentes, articleIdArticle, tempsIdTemps, emplacementIdEmplacement);
    }
}
