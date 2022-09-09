package pigs;

import pigs.PigsGame;

public class PigsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Pigs.");

		PigsGame game = new PigsGame();
		game.printrules();
		System.out.println();

		game.play();

		// TODO

		System.out.println("That's all folks");
	}

}
