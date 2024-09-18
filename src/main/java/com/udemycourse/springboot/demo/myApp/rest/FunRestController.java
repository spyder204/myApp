package com.udemycourse.springboot.demo.myApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//expose '/' endpoint that returns "Hello world"
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Hello Worldddd";
	}
	@GetMapping("/hello")
	public String sayHelloAgain() {
		return "Hey there";
	}
}
