package com.springboot.demo.FristSpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	
	@Autowired
	HelloService service;

	@GetMapping("/demo")
	public String display() {
		String s=service.m1();
		return s;
		
	}

	@GetMapping("/test")
	public String test() {
		return "test for java application ";
	}
	
	
}
