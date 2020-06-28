package com.batch.etl.model;

import com.batch.etl.domain.bdd.*;

public class Transaction {

    private Article article;

    private ArticleHasEmployeeHasClient articleHasEmployeeHasClient;

    private Branche branche;

    private Client client;

    private Employee employee;

    public Transaction(Article article, ArticleHasEmployeeHasClient articleHasEmployeeHasClient, Branche branche, Client client, Employee employee) {
        this.article = article;
        this.articleHasEmployeeHasClient = articleHasEmployeeHasClient;
        this.branche = branche;
        this.client = client;
        this.employee = employee;
    }

    public Article getArticle() {
        return article;
    }

    public ArticleHasEmployeeHasClient getArticleHasEmployeeHasClient() {
        return articleHasEmployeeHasClient;
    }

    public Branche getBranche() {
        return branche;
    }

    public Client getClient() {
        return client;
    }

    public Employee getEmployee() {
        return employee;
    }
}
