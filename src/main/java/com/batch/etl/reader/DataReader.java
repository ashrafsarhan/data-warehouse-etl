package com.batch.etl.reader;

import com.batch.etl.BddDataStore;
import com.batch.etl.domain.bdd.*;
import com.batch.etl.model.Transaction;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * The Class DataReader.
 *
 * @author ashraf
 */
public class DataReader implements ItemReader<Transaction> {

	@Autowired
	private BddDataStore bddDataStore;
	private int nextRecordIndex;
	private List<ArticleHasEmployeeHasClient> data;

	public DataReader() {
		initialize();
	}

	private void initialize() {
		data = bddDataStore.getArticleHasEmployeeHasClientDao().findAll();
		this.nextRecordIndex = 0;
	}

	@Override
	public Transaction read() throws Exception {
		Transaction transaction = null;
		ArticleHasEmployeeHasClient articleHasEmployeeHasClient = null;
		if (nextRecordIndex < data.size()) {
			articleHasEmployeeHasClient = data.get(nextRecordIndex);
			Article article = bddDataStore.getBddArticleDao().getOne(articleHasEmployeeHasClient.getArticleIdArticle());
			Client client = bddDataStore.getClientDao().getOne(articleHasEmployeeHasClient.getClientIdClient());
			Employee employee = bddDataStore.getEmployeeDao().getOne(articleHasEmployeeHasClient.getEmployeeIdEmployee());
			Branche branche = bddDataStore.getBrancheDao().getOne(employee.getBrancheIdBranche());
			transaction = new Transaction(article, articleHasEmployeeHasClient, branche, client, employee);
			nextRecordIndex++;
		}
		return transaction;
	}

}
