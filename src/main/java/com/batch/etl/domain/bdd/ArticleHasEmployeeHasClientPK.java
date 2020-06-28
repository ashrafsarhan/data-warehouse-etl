package com.batch.etl.domain.bdd;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ArticleHasEmployeeHasClientPK implements Serializable {
    private int articleIdArticle;
    private int employeeIdEmployee;
    private int clientIdClient;

    @Column(name = "Article_id_Article")
    @Id
    public int getArticleIdArticle() {
        return articleIdArticle;
    }

    public void setArticleIdArticle(int articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

    @Column(name = "Employee_id_Employee")
    @Id
    public int getEmployeeIdEmployee() {
        return employeeIdEmployee;
    }

    public void setEmployeeIdEmployee(int employeeIdEmployee) {
        this.employeeIdEmployee = employeeIdEmployee;
    }

    @Column(name = "Client_id_Client")
    @Id
    public int getClientIdClient() {
        return clientIdClient;
    }

    public void setClientIdClient(int clientIdClient) {
        this.clientIdClient = clientIdClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleHasEmployeeHasClientPK that = (ArticleHasEmployeeHasClientPK) o;
        return articleIdArticle == that.articleIdArticle &&
                employeeIdEmployee == that.employeeIdEmployee &&
                clientIdClient == that.clientIdClient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleIdArticle, employeeIdEmployee, clientIdClient);
    }
}
