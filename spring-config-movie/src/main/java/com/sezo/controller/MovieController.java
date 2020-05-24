package com.sezo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MovieController {

	@Value("${movie.name}")
	private String name;

	@Value("${movie.year}")
	private String year;
	
	
	@RequestMapping("/movie")
	public String greeting() {

		return  name + " " + year;
	}

}
