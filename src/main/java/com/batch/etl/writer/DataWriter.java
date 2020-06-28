package com.batch.etl.writer;

import java.util.List;

import com.batch.etl.DwDataStore;
import com.batch.etl.model.Fact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The Class DataWriter.
 * 
 * @author ashraf
 */
public class DataWriter implements ItemWriter<Fact> {

	@Autowired
	private DwDataStore dwDataStore;

	private static final Logger log = LoggerFactory.getLogger(DataWriter.class);

	@Override
	public void write(List<? extends Fact> facts) throws Exception {
		facts.forEach(t -> {
			//TODO: Add any pre write data logic and utilize the dwDataStore dao to save the dw facts
		});
	}

}
