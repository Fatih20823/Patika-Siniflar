package com.fatih.model;

import com.fatih.Attack;
import com.fatih.StathicMethods;

public class Monster extends GameElement {

	private String type;

	public Monster(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public int gettAttackPoint(Attack attack) {

		return attack.calculateAttackPoints(StathicMethods.getRandomNumber(1, 10));
	}

}
