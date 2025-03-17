package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	
	@Bean
	public String name() {
		return "Suraj";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Ashford", "Charlotte"));
	}
	
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name,age, address2);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Grove Side Lane", "Charlotte");
	}
}
