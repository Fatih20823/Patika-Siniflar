package com.fatih.model;

public class Stick extends Tool {

	private int durability;
	private static final int INITIAL_DURABILITY = 50;

	public Stick() {
		super(10, 5);
		this.durability = INITIAL_DURABILITY;

	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	@Override
	public String toString() {
		return "Stick [durability=" + durability + ", getPower()=" + getPower() + ", getPrice()=" + getPrice() + "]";
	}

	@Override
	public void refill() {
		this.durability = INITIAL_DURABILITY;
		System.out.println("stick refill");

	}

}
