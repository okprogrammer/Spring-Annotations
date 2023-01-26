package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesInjectionDemo {

	public static void main(String[] args) {
		// load spring application context xml file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean from context
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		// call fotune method
		System.out.println(swimCoach.getDailyFortune());
		// call user detail function
		swimCoach.getDetails();
		// close context
		context.close();
	}

}
