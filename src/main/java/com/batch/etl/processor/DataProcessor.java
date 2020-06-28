package com.batch.etl.processor;

import com.batch.etl.domain.bdd.ArticleHasEmployeeHasClient;
import com.batch.etl.model.Fact;
import com.batch.etl.model.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

/**
 * The Class DataProcessor.
 * 
 * @author ashraf
 */
public class DataProcessor implements ItemProcessor<Transaction, Fact> {

	private static final Logger log = LoggerFactory.getLogger(DataProcessor.class);

	@Override
	public Fact process(final Transaction transaction) throws Exception {

		//TODO: Add your data transformation logic to create the dw data

		final Fact fact = new Fact(null, null, null, null);

		log.trace("Converting transaction (" + transaction + ") into fact (" + fact + ")");

		return fact;
	}

}
