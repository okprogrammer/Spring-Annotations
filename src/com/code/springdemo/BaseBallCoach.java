package com.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "BaseBallCoach are super lazy.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
