package com.ganesh.springdi;

import com.ganesh.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ganesh.services","com.ganesh.springdi"})
public class SpringDiApplication {

	public static void main(String[] args) {

		// returns a spring app context
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		// Spring Framework creates controller object an stores inside the spring context
		// Asking the context to get the controller

		System.out.println("------- Primary Bean --------");
		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		/* Dependency Injection / IOC using spring */

		System.out.println("------- Property DI -------");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		greeting = propertyInjectedController.getGreeting();

		System.out.println(greeting);

		System.out.println("------- Setter DI --------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		greeting = setterInjectedController.getGreeting();

		System.out.println(greeting);

		System.out.println("------- Constructor DI -------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		greeting = constructorInjectedController.getGreeting();

		System.out.println(greeting);

		System.out.println("-------- Using Profiles -------");

		I18nController i18nController = (I18nController) context.getBean("i18nController");

		greeting = i18nController.sayHello();

		System.out.println(greeting);
	}

}
