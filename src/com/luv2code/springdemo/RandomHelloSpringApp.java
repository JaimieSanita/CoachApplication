package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomHelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballCoach baseballCoach = context.getBean("myBaseballCoach", BaseballCoach.class);
		
		System.out.println(baseballCoach.getDailyFortune());
		
		context.close();

	}

}
