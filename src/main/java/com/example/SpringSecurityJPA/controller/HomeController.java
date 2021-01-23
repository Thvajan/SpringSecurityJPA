package com.example.SpringSecurityJPA.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return ("<h1>Welcome Home</h1>");
	}

	@RequestMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}

	@RequestMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
}
