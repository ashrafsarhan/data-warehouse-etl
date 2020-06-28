package com.batch.etl;

import com.batch.etl.listener.JobCompletionNotificationListener;
import com.batch.etl.model.Fact;
import com.batch.etl.model.Transaction;
import com.batch.etl.processor.DataProcessor;
import com.batch.etl.reader.DataReader;
import com.batch.etl.writer.DataWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Class BatchConfiguration.
 *
 * @author ashraf
 */
@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	// DataReader (Reader)
	@Bean
	public DataReader dataReader() {
		return new DataReader();
	}

	// DataProcessor (Processor)
	@Bean
	public DataProcessor dataProcessor() {
		return new DataProcessor();
	}

	// DataWriter (Writer)
	@Bean
	public DataWriter dataWriter() {
		return new DataWriter();
	}

	// JobCompletionNotificationListener (File loader)
	@Bean
	public JobExecutionListener listener() {
		return new JobCompletionNotificationListener();
	}

	// Configure job step
	@Bean
	public Job dwETLJob() {
		return jobBuilderFactory.get("DW ETL Job").incrementer(new RunIdIncrementer()).listener(listener())
				.flow(etlStep()).end().build();
	}

	@Bean
	public Step etlStep() {
		return stepBuilderFactory.get("Extract -> Transform -> Aggregate -> Load").<Transaction, Fact> chunk(10000)
				.reader(dataReader()).processor(dataProcessor())
				.writer(dataWriter())
				.build();
	}

}
