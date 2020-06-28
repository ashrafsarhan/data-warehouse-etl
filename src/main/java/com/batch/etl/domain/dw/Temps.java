package com.batch.etl.domain.dw;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Temps {
    private int idTemps;
    private int nQuarter;
    private int annee;

    @Id
    @Column(name = "id_temps")
    public int getIdTemps() {
        return idTemps;
    }

    public void setIdTemps(int idTemps) {
        this.idTemps = idTemps;
    }

    @Basic
    @Column(name = "N_quarter")
    public int getnQuarter() {
        return nQuarter;
    }

    public void setnQuarter(int nQuarter) {
        this.nQuarter = nQuarter;
    }

    @Basic
    @Column(name = "Annee")
    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temps temps = (Temps) o;
        return idTemps == temps.idTemps &&
                nQuarter == temps.nQuarter &&
                annee == temps.annee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTemps, nQuarter, annee);
    }
}
