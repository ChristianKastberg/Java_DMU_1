package craps;

import craps.CrapsGame;

public class CrapsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Craps.");

		CrapsGame game = new CrapsGame();
		game.printRules();
		System.out.println();

		game.play();

		// TODO

		System.out.println("That's all folks");
	}
}
