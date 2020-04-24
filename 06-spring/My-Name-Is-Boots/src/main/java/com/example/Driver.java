package com.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Revature
 *
 *Spring boot is an opinionated approach to web development.
 *		it is a preconfigured, bloated, web server application.
 *		this way we only need to focus on the business logic.
 *		the @SpringBootApplication is a convenience annotation.
 *		it replaces:
 *			@Configuration
 *			@EnableAutoConfiguration
 *			@ComponentScan
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Driver {

	public static void main(String[] args) {
		SpringApplication.run(Driver.class, args);
	}
}

@RestController
class Ready{
	@GetMapping("/start.app")
	public String start() {
		return "<h1>im ready, im ready, im ready...</h1>";
	}
}