package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")

public class MyController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Sakib";
	}
	
}
