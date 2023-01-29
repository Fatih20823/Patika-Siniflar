package com.fatih;

public class StathicMethods {

	public static int getRandomNumber(int min, int max) {
		return min + (int) (Math.random() * max);
	}

}
