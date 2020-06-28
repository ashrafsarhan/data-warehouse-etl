package com.batch.etl.domain.dw;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Article {
    private int idArticle;
    private String nomArticle;
    private String marque;
    private String categorie;
    private double prix;
    private String fabriqueEn;
    private String fournisseur;

    @Id
    @Column(name = "id_Article")
    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    @Basic
    @Column(name = "Nom_article")
    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    @Basic
    @Column(name = "Marque")
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Basic
    @Column(name = "Categorie")
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Basic
    @Column(name = "Prix")
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "Fabrique_en")
    public String getFabriqueEn() {
        return fabriqueEn;
    }

    public void setFabriqueEn(String fabriqueEn) {
        this.fabriqueEn = fabriqueEn;
    }

    @Basic
    @Column(name = "Fournisseur")
    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return idArticle == article.idArticle &&
                Double.compare(article.prix, prix) == 0 &&
                Objects.equals(nomArticle, article.nomArticle) &&
                Objects.equals(marque, article.marque) &&
                Objects.equals(categorie, article.categorie) &&
                Objects.equals(fabriqueEn, article.fabriqueEn) &&
                Objects.equals(fournisseur, article.fournisseur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, nomArticle, marque, categorie, prix, fabriqueEn, fournisseur);
    }
}
