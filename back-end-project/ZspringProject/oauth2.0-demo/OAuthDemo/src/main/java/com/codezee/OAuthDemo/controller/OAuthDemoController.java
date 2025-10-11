package com.codezee.OAuthDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class OAuthDemoController {
	@GetMapping("/public")
	public String publicApi() {
		return "Hye, public..";
	}

	@GetMapping("/private")
	public String privateApi() {
		return "Authenticated!!";
	}

}
