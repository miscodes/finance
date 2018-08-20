package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class DemoApplication {
//
//	
//	// demo app
//	
//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//}

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;

// @SpringBootApplication
public class DemoApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {
	static final Logger logger = LogManager.getLogger(DemoApplication.class.getName());

	public static void main(String[] args) throws Exception {
		logger.info("entered application");
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

}
