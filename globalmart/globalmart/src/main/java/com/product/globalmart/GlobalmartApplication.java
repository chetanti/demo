package com.product.globalmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GlobalmartApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GlobalmartApplication.class, args);
		
		/*for(String name : context.getBeanDefinitionNames())
		{
		//	System.out.println("name is " + name);
		}*/
		System.out.println("Spring Boot Starter");
		
		
	}
}
