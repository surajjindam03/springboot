package com.in28minutes.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Named
@Component
class BusinessService{
	private DataService dataService;
	
	
	public DataService getDataService() {
		System.out.println("Setter Injection");
		return dataService;
	}
	
//	@Inject
	@Autowired
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
}

//@Named
@Component
class DataService{
	
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
	



	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("HELLO" + context.getBean(BusinessService.class).getDataService());
		}
		
		
	
		
	

	}

}
