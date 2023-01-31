package com.code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sport.properties")
public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService sadFortuneService) {
		this.fortuneService = sadFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim doing dail workout 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
