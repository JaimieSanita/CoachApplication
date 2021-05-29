package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add an init method; custom code to be executed
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
	//add a destroy method

}
