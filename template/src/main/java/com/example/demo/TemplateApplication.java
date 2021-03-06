package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TemplateApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TemplateApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		
		a.setId(1);
		a.setName("Sakib");
		
		System.out.print(a.getId());
		System.out.print(a.getName());
		
		a.callLaptop();
		
	}

}
