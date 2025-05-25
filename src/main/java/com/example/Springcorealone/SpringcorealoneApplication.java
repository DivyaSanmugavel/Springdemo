package com.example.Springcorealone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcorealoneApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringcorealoneApplication.class, args);
		Beancreation greetingService = context.getBean(Beancreation.class);
		greetingService.greet();
		Beanaccss beanaccss = context.getBean(Beanaccss.class);
		beanaccss.demo();
	}
}