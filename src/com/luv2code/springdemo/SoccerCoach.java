package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	//add new fields for email address and team
	private String emailAddress;
	
	private String team;
	
	//create no arg constructor for spring to call when making ref to bean
	public SoccerCoach() {
		System.out.println("SoccerCoach: inside no-arg constrcutor.");
	}
	
	//setter method to be called by spring with dependency injected
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SoccerCoach: inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("SoccerCoach: inside setter method - setEmailAddress.");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("SoccerCoach: inside setter method - setTeam.");
		this.team = team;
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
