package com.fatih.model;

import java.util.ArrayList;
import java.util.Objects;

import com.fatih.Attack;
import com.fatih.StathicMethods;

public class Player extends GameElement {
	private String name;
	private int age;
//	private Stick stick;
//	private Catapult catapult;
//	private Cannon cannon;

	ArrayList<Tool> tools;

	public Player(String name, int age) {
		this.name = name;
		setAge(age);
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		if (age < 10) {
			throw new IllegalArgumentException("Age should be greather than 10");
		}
		this.age = age;
	}

	public void addTool(Tool tool) {
		if (tools == null) {
			tools = new ArrayList<>();
		}
		tools.add(tool);
	}

	public void printTools() {
		for (Tool tool : tools) {
			System.out.println(tool);
		}
//				if (tool instanceof Stick) {
//			}
//				Stick stick = (Stick) tool;
//				System.out.println(stick);
//			} else if (tool instanceof Catapult) {
//				Catapult catapult = (Catapult) tool;
//				System.out.println(catapult);
//			} else if (tool instanceof Cannon) {
//				Cannon cannon = (Cannon) tool;
//				System.out.println(cannon);
//			}
	}

	public void refillTools() {
		for (Tool tool : tools) {
			tool.refill();
		}
	}

	@Override
	public int gettAttackPoint(Attack attack) {
		return StathicMethods.getRandomNumber(1, 10);
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Player)) {
//			return false;
//		}
//		Player other = (Player) obj;
//		return age == other.age && name == other.name;
//	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hash(age,name);
//	}

}
