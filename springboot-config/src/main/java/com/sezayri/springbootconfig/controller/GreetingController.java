package com.sezayri.springbootconfig.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	MailConfiguration mailConf;

	@Value("${app.greeting}")
	private String message;

	@Value("${app.version :4.2}")
	private String version;

	@Value("${app.environment.names}")
	private List<String> envrionments;

	@Value("#{${app.database}}")
	private Map<String, String> dbConnection;

	@Autowired
	private Environment env;
	
	@RequestMapping("/greeting")
	public String greeting() {

		return message + " " + version + " " + envrionments + dbConnection;
	}

	@RequestMapping("/email")
	public String mailInfo() {

		return mailConf.getHostname() + " " + mailConf.getPort() + " " + mailConf.getFrom();
	}
	
	@RequestMapping("/env")
	public String getEnvDetail() {

		return env.toString();
	}

}
