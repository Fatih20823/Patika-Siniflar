package com.fatih;

import java.util.Scanner;

import com.fatih.model.Monster;
import com.fatih.model.Player;

public class Game {
	public static final int FULL_HEALT = 100;

	private Monster monster;
	private Player player;

	public void startGame() {
		buildPlayer();
		buildMonster();

		do {
			startAttacks();
			resetHealths();
		} while (ShouldContinue());
	}

	private void startAttacks() {
		int round = 1;
		while (monster.isAlive() && player.isAlive()) {
			System.out.println("ROUND: " + round);
			System.out.println("Player " + player.getName() + " attack");
			monster.decreaseHealt(player.gettAttackPoint(new NormalAttack()));

			if (!monster.isAlive()) {
				break;
			}
			System.out.println("Monster " + monster.getType() + " attack");
			Attack attack = new NormalAttack();
			if (round == 3) {
				attack = new SuperAttack();
			} else if (round == 18) {
				attack = new ExtremeAttack();
			}
			player.decreaseHealt(monster.gettAttackPoint(attack));

			printHealthStatus();
			round++;
		}

		System.out.println((player.isAlive() ? "Player" : "Monster") + " WINS!");
	}

	private void resetHealths() {
		monster.resetHealt();
		player.resetHealt();
	}

	private void printHealthStatus() {
		System.out.println("Player health:" + player.getHealth());
		System.out.println("Monster health:" + monster.getHealth());
	}

	private int askAge() {
		System.out.println("Yasinizi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private void buildMonster() {
		monster = new Monster("Big Head");
	}

	private String askName() {
		System.out.println("Adinizi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private boolean ShouldContinue() {
		System.out.println("Tekrar Oynat? Evet, Hayır");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		return answer.trim().toLowerCase().equals("evet");
	}

	private void buildPlayer() {
		String name = askName();
		int age = askAge();
		player = new Player(name, age);
	}

}
