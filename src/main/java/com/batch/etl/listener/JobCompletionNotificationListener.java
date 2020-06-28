package com.batch.etl.listener;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The Class JobCompletionNotificationListener
 *
 * @author ashraf
 */
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

	@Override
	public void afterJob(JobExecution jobExecution) {
		switch (jobExecution.getStatus()) {
			case COMPLETED:
				log.info("ETL Job has been completed!");
				break;
			case FAILED:
				log.info("ETL Job has been Failed!");
				break;
		}
	}
}
