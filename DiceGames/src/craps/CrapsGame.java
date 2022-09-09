package craps;

import java.util.Scanner;

import simple.DiceThrower;

public class CrapsGame {

	/**
	 * Simulates playing one game of craps.
	 */
	public void play() {
		// TODO
		Scanner scanner = new Scanner(System.in);
		DiceThrower thrower = new DiceThrower();

		boolean comeoutroll = true;
		int point = 0;

		boolean finished = false;

		while (!finished) {
			// TODO: Roll dice, print roll description.

			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("y")) {
				thrower.getGenerator();
				thrower.roll();
				System.out.println(thrower.rollDescription());

				// First throw win/lose conditions
				if (comeoutroll == true && thrower.sum() == 7) {
					finished = true;
					printGameWon();
				}
				if (comeoutroll == true && thrower.sum() == 11) {
					finished = true;
					printGameWon();
				}
				if (comeoutroll == true && thrower.sum() == 2) {
					finished = true;
					printGameLost();
				}
				if (comeoutroll == true && thrower.sum() == 3) {
					finished = true;
					printGameLost();
				}
				if (comeoutroll == true && thrower.sum() == 12) {
					finished = true;
					printGameLost();
				}
				comeoutroll = false;
				if (comeoutroll = false) {
					System.out.println("comoutroll = " + comeoutroll);
				}

				// setting the point

				if (finished == false && point == thrower.sum() && point != 7 && thrower.sum() != 7
						&& comeoutroll == false) {
					printGameWon();
					comeoutroll = false;
					finished = true;
				}
				if (finished == false && point != 0 && point != 7 && thrower.sum() != 7 && comeoutroll == false) {
					System.out.println("");
					System.out.println("your point is: " + point);
					System.out.println("Roll again? (y/n)");
				}

				if (finished == false && point == 0 && point != 7 && point != 7 && thrower.sum() != 7
						&& comeoutroll == false) {
					point = thrower.sum();

					System.out.println("");
					System.out.println("your point is " + point);
					System.out.println("Roll again? (y/n)");
				}

			}

		}

		scanner.close();
	}

	/**
	 * Prints a 'You have won' message.
	 */
	public void printGameWon() {
		// TODO
		System.out.println("You Won");
	}

	/**
	 * Prints a 'You have lost' message.
	 */
	public void printGameLost() {
		// TODO
		System.out.println("You Lost");
	}

	/**
	 * Prints the rules of craps.
	 */
	public void printRules() {
		// TODO
		System.out.println("In the game a player throws 2 dice. The first throw is called 'the come out roll'.");
		System.out.println("The player wins, if the sum of the dice is 7 or 11.");
		System.out.println("The player loses, if the sum is 2, 3 or 12.");
		System.out.println(
				"If the sum is something else (that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'.");
		System.out.println("The player will now continue throwing the dice until he has lost or won.");
		System.out.println("A sum equal his 'point' is a win, and a sum equal 7 is a loss.");
	}

}
