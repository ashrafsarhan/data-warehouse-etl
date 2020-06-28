package com.batch.etl.domain.bdd;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Branche {
    private int idBranche;
    private String nomBranche;
    private String adresseBranche;
    private String villeBranche;

    @Id
    @Column(name = "id_Branche")
    public int getIdBranche() {
        return idBranche;
    }

    public void setIdBranche(int idBranche) {
        this.idBranche = idBranche;
    }

    @Basic
    @Column(name = "Nom_branche")
    public String getNomBranche() {
        return nomBranche;
    }

    public void setNomBranche(String nomBranche) {
        this.nomBranche = nomBranche;
    }

    @Basic
    @Column(name = "Adresse_branche")
    public String getAdresseBranche() {
        return adresseBranche;
    }

    public void setAdresseBranche(String adresseBranche) {
        this.adresseBranche = adresseBranche;
    }

    @Basic
    @Column(name = "Ville_branche")
    public String getVilleBranche() {
        return villeBranche;
    }

    public void setVilleBranche(String villeBranche) {
        this.villeBranche = villeBranche;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branche branche = (Branche) o;
        return idBranche == branche.idBranche &&
                Objects.equals(nomBranche, branche.nomBranche) &&
                Objects.equals(adresseBranche, branche.adresseBranche) &&
                Objects.equals(villeBranche, branche.villeBranche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBranche, nomBranche, adresseBranche, villeBranche);
    }
}
