package com.batch.etl.domain.bdd;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EmployeePK implements Serializable {
    private int idEmployee;
    private int brancheIdBranche;

    @Column(name = "id_Employee")
    @Id
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Column(name = "Branche_id_Branche")
    @Id
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
        EmployeePK that = (EmployeePK) o;
        return idEmployee == that.idEmployee &&
                brancheIdBranche == that.brancheIdBranche;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, brancheIdBranche);
    }
}
