package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//create no arg constructor for spring to call when making ref to bean
	public SoccerCoach() {
		System.out.println("SoccerCoach: inside no-arg constrcutor.");
	}
	
	//setter method to be called by spring with dependency injected
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SoccerCoach: inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Dribble quickly for 15 minutes!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
