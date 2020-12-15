package io.learn.springboot.configurations.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Value("${app.user.name}")
	private String name;

	@Value("${app.user.role}")
	private String role;

	@Value("${app.user.language}")
	private String language;

	@GetMapping("/")
	public String getUserDetails() {
		return name + ":" + role + ":" + language;
	}
}