package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Scope(value="prototype")

public class Alien {
	private int id;
	private String name;
	
	
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void callLaptop() {
		laptop.setName("ASUS");
		System.out.println(laptop.getName());
	}
}
