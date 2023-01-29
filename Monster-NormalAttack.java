package com.fatih;

public class NormalAttack implements Attack {

	@Override
	public int calculateAttackPoints(int attackPoints) {
		System.out.println("NORMAL ATTACK");
		return attackPoints;
	}

}
