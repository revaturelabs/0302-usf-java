package com.example;

import org.apache.log4j.Logger;

public class MainDriver {

	public static final Logger logger = Logger.getLogger(MainDriver.class);
	
	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.error("this is an error message");
	}
}
