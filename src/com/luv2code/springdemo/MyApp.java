package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object; coding to the interface 
		Coach theCoach = new TrackCoach();
		Coach secondCoach = new SoccerCoach();
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(secondCoach.getDailyWorkout());
		
		
	}

}
