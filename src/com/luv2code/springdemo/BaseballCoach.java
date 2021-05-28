package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field
	private FortuneService fortuneService;
	//define constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 40 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

}
