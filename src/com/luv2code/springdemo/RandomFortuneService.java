package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of string
	private String[] fortuneArr = { "You will be hungry later", "If at first you don't succeed, try, try again",
			"Always be you" };

	// create random number generator
	private Random random = new Random();

	@Override
	public String getFortune() {
		// pick random string from array
		int index = random.nextInt(fortuneArr.length);
		String theFortune = fortuneArr[index];
		return theFortune;
	}

}
