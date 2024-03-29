package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class JenkinsController {

	@GetMapping("/test-jenkins")
	public String getData() {
		return "THIS IS JENKINGS TEST";
	}

}