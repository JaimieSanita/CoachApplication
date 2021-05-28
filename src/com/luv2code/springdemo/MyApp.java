package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object; coding to the interface 
		Coach thecoach = new TrackCoach();
		//use the object
		System.out.println(thecoach.getDailyWorkout());
		
		
	}

}
