package com.fatih.model;

import com.fatih.Attack;
import com.fatih.Game;

public abstract class GameElement {
	private int health;

	public GameElement() {
		setHealth(Game.FULL_HEALT);

	}

	private void setHealth(int health) {
		if (health > Game.FULL_HEALT) {
			throw new IllegalArgumentException("Health should be smaller than " + Game.FULL_HEALT);
		}
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void resetHealt() {
		health = Game.FULL_HEALT;
	}

	public void decreaseHealt(int points) {
		health = health - points;
	}

	public boolean isAlive() {
		return health > 0;
	}

	public abstract int gettAttackPoint(Attack attack);
}
