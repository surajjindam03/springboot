package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SayHelloController {

	
	
	@RequestMapping("say-hello")
	public String sayHello() {
		return "Hello! What are you doing today?";
	}
	
}
