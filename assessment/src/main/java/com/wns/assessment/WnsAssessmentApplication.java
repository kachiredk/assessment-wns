package com.wns.assessment;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;

@WnsAssessmentApp
public class WnsAssessmentApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(WnsAssessmentApplication.class);

	@Autowired
	private Environment environment;

	public WnsAssessmentApplication(Environment env) {
		this.environment = env;
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(WnsAssessmentApplication.class);
		application.run(args);
		LOGGER.info("Application Started Fine...!");
	}

	@PostConstruct
	public void logProfile() {
		LOGGER.info("Application has been launched with profile:{} ", environment.getActiveProfiles()[0]);
	}
}