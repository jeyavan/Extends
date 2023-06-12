package com.Nive.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExtendsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(ExtendsApplication.class, args);
		Vechicles vec=context.getBean(Vechicles.class);	
	     vec.display();
	}

}
