package com.batch.etl;

import com.batch.etl.dao.bdd.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BddDataStore {

    @Autowired
    private ArticleDao bddArticleDao;

    @Autowired
    private ArticleHasEmployeeHasClientDao articleHasEmployeeHasClientDao;

    @Autowired
    private BrancheDao brancheDao;

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private EmployeeDao employeeDao;

    public ArticleDao getBddArticleDao() {
        return bddArticleDao;
    }

    public ArticleHasEmployeeHasClientDao getArticleHasEmployeeHasClientDao() {
        return articleHasEmployeeHasClientDao;
    }

    public BrancheDao getBrancheDao() {
        return brancheDao;
    }

    public ClientDao getClientDao() {
        return clientDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
