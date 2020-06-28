package com.batch.etl.domain.dw;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(VentesPK.class)
public class Ventes {
    private int idVentes;
    private double montantVentes;
    private int articleIdArticle;
    private int tempsIdTemps;
    private int emplacementIdEmplacement;

    @Id
    @Column(name = "id_ventes")
    public int getIdVentes() {
        return idVentes;
    }

    public void setIdVentes(int idVentes) {
        this.idVentes = idVentes;
    }

    @Basic
    @Column(name = "montant_ventes")
    public double getMontantVentes() {
        return montantVentes;
    }

    public void setMontantVentes(double montantVentes) {
        this.montantVentes = montantVentes;
    }

    @Id
    @Column(name = "Article_id_Article")
    public int getArticleIdArticle() {
        return articleIdArticle;
    }

    public void setArticleIdArticle(int articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

    @Id
    @Column(name = "temps_id_temps")
    public int getTempsIdTemps() {
        return tempsIdTemps;
    }

    public void setTempsIdTemps(int tempsIdTemps) {
        this.tempsIdTemps = tempsIdTemps;
    }

    @Id
    @Column(name = "Emplacement_id_Emplacement")
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
        Ventes ventes = (Ventes) o;
        return idVentes == ventes.idVentes &&
                Double.compare(ventes.montantVentes, montantVentes) == 0 &&
                articleIdArticle == ventes.articleIdArticle &&
                tempsIdTemps == ventes.tempsIdTemps &&
                emplacementIdEmplacement == ventes.emplacementIdEmplacement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVentes, montantVentes, articleIdArticle, tempsIdTemps, emplacementIdEmplacement);
    }
}
