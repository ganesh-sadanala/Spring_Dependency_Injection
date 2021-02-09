package com.ganesh.springdi;

import com.ganesh.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		// returns a spring app context
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		// Spring Framework creates controller object an stores inside the spring context
		// Asking the context to get the controller
		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
