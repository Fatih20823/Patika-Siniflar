package com.fatih.model;

public class Cannon extends Tool {
	private static final int INITIAL_CANNON_BALL_COUNT = 5;
	private int numberofCannonBalls;

	public Cannon() {
		super(20, 25);
		this.numberofCannonBalls = INITIAL_CANNON_BALL_COUNT;

	}

	public int numberofCannonBalls() {
		return numberofCannonBalls;
	}

	public void setnumberofCannonBalls(int numberofCannonBalls) {
		this.numberofCannonBalls = numberofCannonBalls;
	}

	@Override
	public String toString() {
		return "Cannon [numberofCannonBalls=" + numberofCannonBalls + ", getPower()=" + getPower() + ", getPrice()="
				+ getPrice() + "]";
	}

	@Override
	public void refill() {
		this.numberofCannonBalls = INITIAL_CANNON_BALL_COUNT;
		System.out.println("cannon refill");
	}

}
