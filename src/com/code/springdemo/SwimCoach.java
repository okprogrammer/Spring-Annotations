package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	@Override
	public String getDailyWorkout() {
		return team + "doing dail workout " + email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void getDetails() {
		System.out.println("Team Name is: " + team);
		System.out.println("Team email id is: " + email);
	}

}
