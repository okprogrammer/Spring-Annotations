package com.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// call the method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		// get email id
		System.out.println(theCoach.getEmail());
		// get team
		System.out.println(theCoach.getTeam());
		// close the context
		context.close();
	}
}
