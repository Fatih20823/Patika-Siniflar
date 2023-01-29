package com.fatih.model;

public class Catapult extends Tool {
	private static final int INITIAL_ROCK_COUNT = 15;
	private int numberofRocks;

	public Catapult() {
		super(15, 20);
		this.numberofRocks = INITIAL_ROCK_COUNT;

	}

	public int getNumberofRocks() {
		return numberofRocks;
	}

	public void setNumberofRocks(int numberofRocks) {
		this.numberofRocks = numberofRocks;
	}

	@Override
	public String toString() {
		return "Catapult [numberofRocks=" + numberofRocks + ", getPower()=" + getPower() + ", getPrice()=" + getPrice()
				+ "]";
	}

	@Override
	public void refill() {
		this.numberofRocks = INITIAL_ROCK_COUNT;
		System.out.println("catapult refill");
	}

}
