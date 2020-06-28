package com.batch.etl.domain.bdd;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(EmployeePK.class)
public class Employee {
    private int idEmployee;
    private String nomEmpl;
    private String categorie;
    private int groupe;
    private double salaire;
    private int brancheIdBranche;

    @Id
    @Column(name = "id_Employee")
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "Nom_empl")
    public String getNomEmpl() {
        return nomEmpl;
    }

    public void setNomEmpl(String nomEmpl) {
        this.nomEmpl = nomEmpl;
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
    @Column(name = "Groupe")
    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    @Basic
    @Column(name = "Salaire")
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Id
    @Column(name = "Branche_id_Branche")
    public int getBrancheIdBranche() {
        return brancheIdBranche;
    }

    public void setBrancheIdBranche(int brancheIdBranche) {
        this.brancheIdBranche = brancheIdBranche;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return idEmployee == employee.idEmployee &&
                groupe == employee.groupe &&
                Double.compare(employee.salaire, salaire) == 0 &&
                brancheIdBranche == employee.brancheIdBranche &&
                Objects.equals(nomEmpl, employee.nomEmpl) &&
                Objects.equals(categorie, employee.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, nomEmpl, categorie, groupe, salaire, brancheIdBranche);
    }
}
