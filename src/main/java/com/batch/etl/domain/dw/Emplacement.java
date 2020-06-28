package com.batch.etl.domain.dw;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Emplacement {
    private int idEmplacement;
    private String nomVille;

    @Id
    @Column(name = "id_Emplacement")
    public int getIdEmplacement() {
        return idEmplacement;
    }

    public void setIdEmplacement(int idEmplacement) {
        this.idEmplacement = idEmplacement;
    }

    @Basic
    @Column(name = "Nom_ville")
    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emplacement that = (Emplacement) o;
        return idEmplacement == that.idEmplacement &&
                Objects.equals(nomVille, that.nomVille);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmplacement, nomVille);
    }
}
