package com.batch.etl.domain.bdd;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Client {
    private int idClient;
    private String nomClient;
    private String adresse;
    private int age;
    private double revenu;
    private String infoCredit;

    @Id
    @Column(name = "id_Client")
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "Nom_client")
    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    @Basic
    @Column(name = "Adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "Age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "Revenu")
    public double getRevenu() {
        return revenu;
    }

    public void setRevenu(double revenu) {
        this.revenu = revenu;
    }

    @Basic
    @Column(name = "Info_credit")
    public String getInfoCredit() {
        return infoCredit;
    }

    public void setInfoCredit(String infoCredit) {
        this.infoCredit = infoCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient &&
                age == client.age &&
                Double.compare(client.revenu, revenu) == 0 &&
                Objects.equals(nomClient, client.nomClient) &&
                Objects.equals(adresse, client.adresse) &&
                Objects.equals(infoCredit, client.infoCredit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, nomClient, adresse, age, revenu, infoCredit);
    }
}
