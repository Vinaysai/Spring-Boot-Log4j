package com.spring.boot.all.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogingController {

	private static final Logger logger = LogManager.getLogger();

	@RequestMapping("/Loging")
	public String log() {

		logger.error("Error level log message");
		logger.debug("This is debug message::");
		logger.info("Info");
		logger.fatal("fatal");

		logger.warn("This is a warning::::");
		return "Logging Sucessfull::::->";
	}

}
