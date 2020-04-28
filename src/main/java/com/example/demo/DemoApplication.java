package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... args) throws InterruptedException {
		log.info("Run-Application...");
		runApp();
		log.info("End-Application...");
	}

	void runApp() throws InterruptedException {
		//Just for connection with JMX Actuator
		Thread.sleep(30000L);
	}

}
