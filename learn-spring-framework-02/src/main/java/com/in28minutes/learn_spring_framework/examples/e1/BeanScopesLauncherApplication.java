package com.in28minutes.learn_spring_framework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
	
	// Returns same instance of the class every time.
	@Component
	class NormalClass{
		
	}
	
	// Creates a new instance of this bean every time.
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Component
	class PrototypeClass{
		
	}
	



	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		}
	
		
	

	}

}
