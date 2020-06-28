package com.batch.etl.domain.bdd;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Article_has_Employee_has_Client", schema = "bdd_allelectronics", catalog = "")
@IdClass(ArticleHasEmployeeHasClientPK.class)
public class ArticleHasEmployeeHasClient {
    private int articleIdArticle;
    private int employeeIdEmployee;
    private int clientIdClient;
    private int numTecket;
    private String temps;
    private Date date;
    private String modePaiment;
    private String qte;

    @Id
    @Column(name = "Article_id_Article")
    public int getArticleIdArticle() {
        return articleIdArticle;
    }

    public void setArticleIdArticle(int articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

    @Id
    @Column(name = "Employee_id_Employee")
    public int getEmployeeIdEmployee() {
        return employeeIdEmployee;
    }

    public void setEmployeeIdEmployee(int employeeIdEmployee) {
        this.employeeIdEmployee = employeeIdEmployee;
    }

    @Id
    @Column(name = "Client_id_Client")
    public int getClientIdClient() {
        return clientIdClient;
    }

    public void setClientIdClient(int clientIdClient) {
        this.clientIdClient = clientIdClient;
    }

    @Basic
    @Column(name = "Num_tecket")
    public int getNumTecket() {
        return numTecket;
    }

    public void setNumTecket(int numTecket) {
        this.numTecket = numTecket;
    }

    @Basic
    @Column(name = "temps")
    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "mode_paiment")
    public String getModePaiment() {
        return modePaiment;
    }

    public void setModePaiment(String modePaiment) {
        this.modePaiment = modePaiment;
    }

    @Basic
    @Column(name = "QTE")
    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleHasEmployeeHasClient that = (ArticleHasEmployeeHasClient) o;
        return articleIdArticle == that.articleIdArticle &&
                employeeIdEmployee == that.employeeIdEmployee &&
                clientIdClient == that.clientIdClient &&
                numTecket == that.numTecket &&
                Objects.equals(temps, that.temps) &&
                Objects.equals(date, that.date) &&
                Objects.equals(modePaiment, that.modePaiment) &&
                Objects.equals(qte, that.qte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleIdArticle, employeeIdEmployee, clientIdClient, numTecket, temps, date, modePaiment, qte);
    }
}
